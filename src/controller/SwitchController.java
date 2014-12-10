
package controller;

import java.util.ArrayList;
import model.DAO.RackDAO;
import model.DAO.SwitchDAO;
import model.Rack;
import model.Switch;


public class SwitchController {
    
    private SwitchDAO switchDao = new SwitchDAO();
    private RackDAO rackDao = new RackDAO();
    private ArrayList<Switch> listaSwitch = new ArrayList<Switch>();
    private ArrayList<Rack> listaRack = new ArrayList<Rack>();

    public ArrayList<Switch> getListaSwitch() {
        return listaSwitch;
    }

    public void setListaSwitch(ArrayList<Switch> listaSwitch) {
        this.listaSwitch = listaSwitch;
    }

    public ArrayList<Rack> getListaRack() {
        return listaRack;
    }

    public void setListaRack(ArrayList<Rack> listaRack) {
        this.listaRack = listaRack;
    }
    
    public void populaListas() {
        listaSwitch = switchDao.buscaTodos();
        listaRack = rackDao.buscaTodos();
    }
    
    public void adicionaSwitch(Switch sw) {
        listaSwitch.add(sw);
        switchDao.salvar(sw);
    }
    
    public void atualizaSwitch(Switch sw) {
        switchDao.alterar(sw);
        listaSwitch = switchDao.buscaTodos();
    }
    
    public void removeSwitch(int index) {
        switchDao.excluir(listaSwitch.get(index));
        listaSwitch.remove(index);
    }
}
