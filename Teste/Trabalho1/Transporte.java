package Trabalho1;

public class Transporte {
    
    private String tipo;
    private String trafego;
    private int velocidade_max;
    private String combustivel;
    private int qtd_combustivel;

    public Transporte(String tipo, String trafego, int velocidade_max, String combustivel, int qtd_combustivel){
        this.tipo = tipo;
        this.trafego = trafego;
        this.velocidade_max = velocidade_max;
        this.combustivel = combustivel;
        this.qtd_combustivel = qtd_combustivel;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTrafego(){
        return trafego;
    }

    public void setTrafego(String trafego){
        this.trafego = trafego;
    }

    public int getVelocidade_max(){
        return velocidade_max;
    }

    public void setVelocidade_max(int velocidade_max){
        this.velocidade_max = velocidade_max;
    }

    public String getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    public int getQtd_combustivel(){
        return qtd_combustivel;
    }

    public void setQtd_combustivel(int qtd_combustivel){
        this.qtd_combustivel = qtd_combustivel;
    }

    public void info(){
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Nome: "+this.trafego);
        System.out.println("Velocidade Máxima: "+this.velocidade_max);
        System.out.println("Combustível: "+this.combustivel);
        System.out.println("Quantidade de combustível: "+this.qtd_combustivel);
    }

    
}
