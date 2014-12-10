
package model.DAO;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Switch;


public class SwitchDAO {
    
    private Connection connection;

    public SwitchDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    public ArrayList<Switch> buscaTodos() {
         try {
            ArrayList<Switch> listaSwitch = new ArrayList<Switch>();
           
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM SWITCH");
            
            ResultSet rs = stmt.executeQuery();   
            while (rs.next()) {  
               
                Switch sw = new Switch();
                sw.setNome(rs.getString("NOME"));
                sw.setIp(rs.getString("IP"));
                sw.setRack(rs.getInt("RACK"));
                sw.setNumero(rs.getInt("NUMERO"));
                
                listaSwitch.add(sw);
            }  
            rs.close();
            stmt.close();

            return listaSwitch;            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void salvar(Switch sw) {
        try {
            
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO SWITCH(nome, ip, rack) VALUES"
                    + " (?, ?, ?)");
            
            stmt.setString(1, sw.getNome());
            stmt.setString(2, sw.getIp());
            stmt.setInt(3, sw.getRack());
           
            
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public void alterar(Switch sw) {
        try {
            PreparedStatement stmt = connection.prepareStatement("UPDATE SWITCH SET nome=?, ip=?, rack=?, WHERE Switch.numero=?");
            
            stmt.setString(1, sw.getNome());
            stmt.setString(2, sw.getIp());
            stmt.setInt(3, sw.getRack());
            stmt.setInt(4, sw.getNumero());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Switch sw) {
        try {
            
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM switch WHERE switch.numero = ?");
            stmt.setInt(1, sw.getNumero());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
