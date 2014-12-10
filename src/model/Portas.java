
package model;


public class Portas {
    
    private int idPorta;
    private int idSwitch;
    private int vlan;
    private int numPorta;
    private String status;
    
    public Portas(){}

    public int getIdSwitch() {
        return idSwitch;
    }

    public void setIdSwitch(int idSwitch) {
        this.idSwitch = idSwitch;
    }
    
    public int getIdPorta() {
        return idPorta;
    }

    public int getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }
    
    public void setIdPorta(int idPorta) {
        this.idPorta = idPorta;
    }
    
    public int getVlan() {
        return vlan;
    }

    public void setVlan(int vlan) {
        this.vlan = vlan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

     
}
