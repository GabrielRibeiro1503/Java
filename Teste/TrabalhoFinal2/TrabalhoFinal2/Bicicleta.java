package TrabalhoFinal2;

import java.util.Random;

public class Bicicleta extends Transporte {

    Random rand = new Random();
    private int tamAro;
    private String amortecedor;
    private int qtdMarcha;
    private String nome;
    private int corrida;

    public Bicicleta(int velocidadeMax, String combustivel, float qtdCombustivel, int tamAro, String amortecedor,
            int qtdMarcha, String nome) {
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.tamAro = tamAro;
        this.amortecedor = amortecedor;
        this.qtdMarcha = qtdMarcha;
        this.nome = nome;
    }

    public int getTam_aro() {
        return tamAro;
    }

    public void setTam_aro(int tamAro) {
        this.tamAro = tamAro;
    }

    public String getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(String amortecedor) {
        this.amortecedor = amortecedor;
    }

    public int getQtdMarcha() {
        return qtdMarcha;
    }

    public void setQtdMarcha(int qtdMarcha) {
        this.qtdMarcha = qtdMarcha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void info() {
        super.info();
        System.out.println("|| Tamanho Aro: " + this.tamAro);
        System.out.println("|| Amortecedor: " + this.amortecedor);
        System.out.println("|| Quantidade de Marcha: " + this.qtdMarcha);
        System.out.println("|| Nome: " + this.nome);
    }

    @Override
    public void entrar() {
        System.out.println("|| !! Você subiu na " + this.nome + " !!");
    }

    @Override
    public void sair() {
        System.out.println("||=======================================|");
        System.out.println("|| !! Você desceu da " + this.nome + " !!");
        System.out.println("|| !! Obrigado por usar esse programa !!");
        System.out.println("||=======================================|");
    }

    @Override
    public void bater() {
        System.out.println("|| Você bateu a bicicleta e morreu !!");
    }

    @Override
    public void corrida() {
        corrida = rand.nextInt(3);

        if (corrida == 0) {
            System.out.println("||==============================|");
            System.out.println("|| Você pedalou mais que ele !!");
            System.out.println("|| Parabéns !!");
        } else if (corrida == 1) {
            System.out.println("||==============================================|");
            System.out.println("|| Infelizmente ele foi mais rápido que você !!");
            System.out.println("|| Você perdeu !!");
        } else {
            System.out.println("||========================|");
            System.out.println("|| Os dois são velozes !!");
            System.out.println("|| Tivemos um empate !!");
        }
    }
}