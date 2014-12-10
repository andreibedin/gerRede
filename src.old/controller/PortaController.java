
package controller;

import java.util.ArrayList;
import model.DAO.PortasDAO;
import model.DAO.SwitchDAO;
import model.Portas;
import model.Rack;
import model.Switch;


public class PortaController {
    
    private PortasDAO portasDao = new PortasDAO();
    private SwitchDAO switchDao = new SwitchDAO();
    private ArrayList<Portas> listaPortas = new ArrayList<Portas>();
    private ArrayList<Switch> listaSwitch = new ArrayList<Switch>();

    public ArrayList<Portas> getListaPortas() {
        return listaPortas;
    }

    public void setListaPortas(ArrayList<Portas> listaPortas) {
        this.listaPortas = listaPortas;
    }

    public ArrayList<Switch> getListaSwitch() {
        return listaSwitch;
    }

    public void setListaSwitch(ArrayList<Switch> listaSwitch) {
        this.listaSwitch = listaSwitch;
    }

      
    public void populaListas() {
        listaSwitch = switchDao.buscaTodos();
        listaPortas = portasDao.buscaTodos();
    }
    
    public void adicionaPortas(Portas porta) {
        listaPortas.add(porta);
        portasDao.salvar(porta);
    }
    
    public void removePorta(int index) {
        System.out.println(index);
        portasDao.excluir(listaPortas.get(index));
        listaPortas.remove(index);
    }
}
