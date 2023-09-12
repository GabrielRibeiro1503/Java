package TrabalhoFinal2;

public class Transporte implements Interface {

    private int velocidadeMax;
    private String combustivel;
    private float qtdCombustivel;

    public Transporte(int velocidadeMax, String combustivel, float qtdCombustivel) {
        this.velocidadeMax = velocidadeMax;
        this.combustivel = combustivel;
        this.qtdCombustivel = qtdCombustivel;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public void info() {
        System.out.println("||===========================================|");
        System.out.println("|| Velocidade Máxima: " + this.velocidadeMax);
        System.out.println("|| Combustível: " + this.combustivel);
        System.out.println("|| Quantidade de combustível: " + this.qtdCombustivel);
    }
}