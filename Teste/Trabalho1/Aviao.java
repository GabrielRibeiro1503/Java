package Trabalho1;

public class Aviao extends Transporte {
    
    private String companhia;
    private String porte;
    private int qtd_pessoas;

    public Aviao(int velocidade_max, String combustivel, int qtd_combustivel, String companhia, String porte, int qtd_pessoas){
        super(velocidade_max, combustivel, qtd_combustivel);
        this.companhia = companhia;
        this.porte = porte;
        this.qtd_pessoas = qtd_pessoas;
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

    public int getQtd_pessoas(){
        return qtd_pessoas;
    }

    public void setQtd_pessoas(int qtd_pessoas){
        this.qtd_pessoas = qtd_pessoas;
    }

    public void info(){
        super.info();
        System.out.println("|| Companhia: "+this.companhia);
        System.out.println("|| Porte: "+this.porte);
        System.out.println("|| Quantidade de Pessoas: "+this.qtd_pessoas);
    }


}