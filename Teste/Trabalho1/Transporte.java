package Trabalho1;

public class Transporte {
    
    private int velocidadeMax;
    private String combustivel;
    private int qtdCombustivel;

    public Transporte(int velocidadeMax, String combustivel, int qtdCombustivel){
        this.velocidadeMax = velocidadeMax;
        this.combustivel = combustivel;
        this.qtdCombustivel = qtdCombustivel;
    }

    public int getVelocidade_max(){
        return velocidadeMax;
    }

    public void setVelocidade_max(int velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }

    public String getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    public int getQtd_combustivel(){
        return qtdCombustivel;
    }

    public void setQtd_combustivel(int qtdCombustivel){
        this.qtdCombustivel = qtdCombustivel;
    }

    public void info(){
        System.out.println();
        System.out.println("||===========================================");
        System.out.println("|| Velocidade Máxima: "+this.velocidadeMax);
        System.out.println("|| Combustível: "+this.combustivel);
        System.out.println("|| Quantidade de combustível: "+this.qtdCombustivel);
    }

    public void entrar(){
    }
}
