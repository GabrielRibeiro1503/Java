package TrabalhoFinal2;
import java.util.Random;

public class Carro extends Transporte{
    
    Random rand = new Random();
    private String marca;
    private String modelo;
    private int corrida;

    public Carro(int velocidadeMax, String combustivel, float qtdCombustivel, String marca, String modelo){
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void info(){
        super.info();
        System.out.println("|| Marca: "+this.marca);
        System.out.println("|| Modelo: "+this.modelo);
    }

    public void abastecer(){
        System.out.println("|| Você encheu o tanque !!");
        System.out.println("|| Vamos seguir viagem !!");
    }

    @Override
    public void entrar(){
        System.out.println("|| !! Você entrou no "+marca+" "+modelo+" !!");
    }

    @Override
    public void sair(){
        System.out.println("||=========================================|");
        System.out.println("|| !! Você saiu do "+marca+" "+modelo+" !!");
        System.out.println("|| !! Obrigado por usar esse programa !!");
        System.out.println("||=========================================|");
    }

    @Override
    public void bater(){
            System.out.println("|| Você bateu o carro no trajeto e morreu !!");
            System.out.println("||===========================================|");
    }

    @Override
    public void corrida(){
        corrida = rand.nextInt(3);

        if(corrida == 0){
            System.out.println("||==================================|");
            System.out.println("|| O seu carro ganhou esse racha !!");
            System.out.println("|| Parabéns !!");
        } else if(corrida == 1){
            System.out.println("||=============================================|");
            System.out.println("|| Infelizmente ele foi mais rápido que você !!");
            System.out.println("|| Você perdeu !!"); 
        } else {
            System.out.println("||========================|");
            System.out.println("|| Os dois são velozes !!");
            System.out.println("|| Tivemos um empate !!");
        }
    }
}