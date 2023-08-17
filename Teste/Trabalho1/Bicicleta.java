package Trabalho1;

public class Bicicleta extends Transporte{
    
    private int tam_aro;
    private String amortecedor; 
    private int qtd_marcha;

    public Bicicleta(int velocidade_max, String combustivel, int qtd_combustivel, int tam_aro, String amortecedor, int qtd_marcha){
        super(velocidade_max, combustivel, qtd_combustivel);
        this.tam_aro = tam_aro;
        this.amortecedor = amortecedor;
        this.qtd_marcha = qtd_marcha;
    }

    public int getTam_aro(){
        return tam_aro;
    }

    public void setTam_aro(int tam_aro){
        this.tam_aro = tam_aro;
    }

    public String getAmortecedor(){
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor){
        this.amortecedor = amortecedor;
    }

    public int getQtd_marcha(){
        return qtd_marcha;
    }

    public void setQtd_marcha(int qtd_marcha){
        this.qtd_marcha = qtd_marcha;
    }

    public void info(){
        super.info();
        System.out.println("|| Tamanho Aro: "+this.tam_aro);
        System.out.println("|| Amortecedor: "+this.amortecedor);
        System.out.println("|| Quantidade de Marcha: "+this.qtd_marcha);
    }
}