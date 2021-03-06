
package model.DAO;

import factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import model.Rack;


public class RackDAO {
    
    private Connection connection;

    public RackDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    public ArrayList<Rack> buscaTodos() {
         try {
            ArrayList<Rack> listaRack = new ArrayList<Rack>();
            
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM RACK");
            
            ResultSet rs = stmt.executeQuery();   
            while (rs.next()) {  
                Rack rack = new Rack();
                rack.setNome(rs.getString("NOME"));
                rack.setNumero(rs.getInt("NUMERO"));
                rack.setSetor(rs.getString("SETOR"));
                rack.setUnidade(rs.getString("UNIDADE"));

                listaRack.add(rack);
            }  
            rs.close();
            stmt.close();

            return listaRack;            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void salvar(Rack rack) {
        try {
            
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO RACK(nome, setor, unidade) VALUES"
                    + " (?,  ?, ?)");
            
            stmt.setString(1, rack.getNome());
            stmt.setString(2, rack.getSetor());
            stmt.setString(3, rack.getUnidade());
           
            
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public void alterar(Rack rack) {
        try {
            PreparedStatement stmt = connection.prepareStatement("UPDATE RACK SET RACK.nome=?, RACK.setor=?, RACK.unidade=? WHERE RACK.numero=?");
            stmt.setString(1, rack.getNome());
            stmt.setString(2, rack.getSetor());
            stmt.setString(3, rack.getUnidade());
            stmt.setInt(4, rack.getNumero());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Rack rack) {
        try {
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM rack WHERE rack.numero = ?");
           stmt.setInt(1, rack.getNumero());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
