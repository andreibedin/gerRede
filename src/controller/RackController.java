
package controller;

import java.util.ArrayList;
import model.DAO.RackDAO;
import model.Rack;

public class RackController {
    
    private RackDAO dao = new RackDAO();
    private ArrayList<Rack> listaRack = new ArrayList<Rack>();
    
    public RackController() {
       buscaTodos();
    }
    
    public void buscaTodos() {
         listaRack = dao.buscaTodos();
    }
   
    public ArrayList<Rack> getListaRack() {
        return listaRack;
    }

    public void setListaRack(ArrayList<Rack> listaRack) {
        this.listaRack = listaRack;
    }

    public void adicionaRack(Rack rack) {
        dao.salvar(rack);
		buscaTodos();
    }
    
    public void removeRack(int index) {
        dao.excluir(listaRack.get(index));
        listaRack.remove(index);
    }
    
    public void alteraRack(Rack rack) {
	dao.alterar(rack);
	}
    
 }
