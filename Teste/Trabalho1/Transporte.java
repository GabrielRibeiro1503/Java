package Trabalho1;

public class Transporte {
    
    private int velocidade_max;
    private String combustivel;
    private int qtd_combustivel;

    public Transporte(int velocidade_max, String combustivel, int qtd_combustivel){
        this.velocidade_max = velocidade_max;
        this.combustivel = combustivel;
        this.qtd_combustivel = qtd_combustivel;
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
        System.out.println("||===========================================");
        System.out.println("|| Velocidade Máxima: "+this.velocidade_max);
        System.out.println("|| Combustível: "+this.combustivel);
        System.out.println("|| Quantidade de combustível: "+this.qtd_combustivel);
    }

    public void entrar(){
    }
}
