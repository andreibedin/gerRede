
package model;


public class Switch {
    
    private String nome;
    private String ip;
    private int rack;
    private int numero;

    public Switch(String nome, String ip, int rack, int numero) {
        this.nome = nome;
        this.ip = ip;
        this.rack = rack;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Switch() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getRack() {
        return rack;
    }

    public void setRack(int rack) {
        this.rack = rack;
    }
    
}
