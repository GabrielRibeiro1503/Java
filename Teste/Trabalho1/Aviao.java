package Trabalho1;

public class Aviao extends Transporte {
    
    private String companhia;
    private String porte;
    private int qtd_assento;

    public Aviao(String tipo, String trafego, int velocidade_max, String combustivel, int qtd_combustivel, String companhia, String porte, int qtd_assento){
        super(tipo, trafego, velocidade_max, combustivel, qtd_combustivel);
        this.companhia = companhia;
        this.porte = porte;
        this.qtd_assento = qtd_assento;
    }

    public String getCompanhia(){
        return companhia;
    }

    public void setCompanhia(String companhia){
        this.companhia = companhia;
    }

    public String getPorte(){
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }

    public int getQtd_assento(){
        return qtd_assento;
    }

    public void setQtd_assento(int qtd_assento){
        this.qtd_assento = qtd_assento;
    }

    public void info(){
        super.info();
        System.out.println("Companhia: "+this.companhia);
        System.out.println("Porte: "+this.porte);
        System.out.println("Quantidade de Assentos: "+this.qtd_assento);
    }
}