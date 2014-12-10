
package model.DAO;

import factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import model.Portas;
import model.DAO.PortasDAO;

public class PortasDAO {
	private Connection connection;

	public PortasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
	
    public ArrayList<Portas> buscaTodos() {
         try {
            ArrayList<Portas> listaPortas = new ArrayList<Portas>();
            
           
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PORTAS");
            
            
            ResultSet rs = stmt.executeQuery();   
            
            while (rs.next()) {  
               
                Portas porta = new Portas();
                porta.setVlan(rs.getInt("VLAN"));
                porta.setStatus(rs.getString("STATUS"));
                porta.setIdPorta(rs.getInt("ID_PORTA"));
                porta.setIdSwitch(rs.getInt("ID_SWITCH"));
                porta.setNumPorta(rs.getInt("PORTA"));
                
                listaPortas.add(porta);
            }  
            rs.close();
            stmt.close();

            return listaPortas;            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void salvar(Portas porta) {
        try {
            
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO PORTAS(id_switch, vlan, status, porta) VALUES"
                    + " (?, ?, ?, ?)");

            stmt.setInt(1, porta.getIdSwitch());
            stmt.setInt(2, porta.getVlan());
            stmt.setString(3, porta.getStatus());
            stmt.setInt(4, porta.getNumPorta());
            
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public void alterar(Portas porta) {
        try {
            PreparedStatement stmt = connection.prepareStatement("UPDATE PORTAS SET id_switch=?, vlan=?, status=?, porta=? WHERE id_porta=?");
            stmt.setInt(1, porta.getIdSwitch());
            stmt.setInt(2, porta.getVlan());
            stmt.setString(3, porta.getStatus());
            stmt.setInt(4, porta.getNumPorta());
            stmt.setInt(5, porta.getIdPorta());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Portas porta) {
        try {
            
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM portas WHERE id_porta = ?");
            stmt.setInt(1, porta.getIdPorta());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
