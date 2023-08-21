package Trabalho1;

public class Bicicleta extends Transporte{
    
    private int tamAro;
    private String amortecedor; 
    private int qtdMarcha;

    public Bicicleta(int velocidadeMax, String combustivel, float qtdCombustivel, int tamAro, String amortecedor, int qtdMarcha){
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.tamAro = tamAro;
        this.amortecedor = amortecedor;
        this.qtdMarcha = qtdMarcha;
    }

    public int getTam_aro(){
        return tamAro;
    }

    public void setTam_aro(int tamAro){
        this.tamAro = tamAro;
    }

    public String getAmortecedor(){
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor){
        this.amortecedor = amortecedor;
    }

    public int getQtd_marcha(){
        return qtdMarcha;
    }

    public void setQtd_marcha(int qtdMarcha){
        this.qtdMarcha = qtdMarcha;
    }

    public void info(){
        super.info();
        System.out.println("|| Tamanho Aro: "+this.tamAro);
        System.out.println("|| Amortecedor: "+this.amortecedor);
        System.out.println("|| Quantidade de Marcha: "+this.qtdMarcha);
    }

    @Override
    public void entrar(){

    }
}
