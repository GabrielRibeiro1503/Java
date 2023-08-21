package Trabalho1;

public class Aviao extends Transporte {
    
    private String companhia;
    private String porte;
    private int qtdPessoas;

    public Aviao(int velocidadeMax, String combustivel, float qtdCombustivel, String companhia, String porte, int qtdPessoas){
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.companhia = companhia;
        this.porte = porte;
        this.qtdPessoas = qtdPessoas;
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
        return qtdPessoas;
    }

    public void setQtd_pessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }

    public void info(){
        super.info();
        System.out.println("|| Companhia: "+this.companhia);
        System.out.println("|| Porte: "+this.porte);
        System.out.println("|| Quantidade de Pessoas: "+this.qtdPessoas);
    }


}