package Trabalho1;

public class Bicicleta extends Transporte{
    
    private int tamAro;
    private String amortecedor; 
    private int qtdMarcha;
    private String nome;

    public Bicicleta(int velocidadeMax, String combustivel, float qtdCombustivel, int tamAro, String amortecedor, int qtdMarcha, String nome){
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.tamAro = tamAro;
        this.amortecedor = amortecedor;
        this.qtdMarcha = qtdMarcha;
        this.nome = nome;
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

    public int getQtdMarcha(){
        return qtdMarcha;
    }

    public void setQtdMarcha(int qtdMarcha){
        this.qtdMarcha = qtdMarcha;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void info(){
        super.info();
        System.out.println("|| Tamanho Aro: "+this.tamAro);
        System.out.println("|| Amortecedor: "+this.amortecedor);
        System.out.println("|| Quantidade de Marcha: "+this.qtdMarcha);
        System.out.println("|| Nome: "+this.nome);
    }

    @Override
    public void entrar(){
        System.out.println("|| !! Você subiu na "+this.nome+" !!");
    }

    @Override
    public void sair(){
        System.out.println("||=======================================|");
        System.out.println("|| !! Você desceu da "+this.nome+" !!");
        System.out.println("|| !! Obrigado por usar esse programa !!");
        System.out.println("||=======================================|");
    }

    @Override
    public void bater(){
        System.out.println("|| Você bateu a bicicleta e morreu !!");
    }
}