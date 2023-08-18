package Trabalho1;

public class Carro extends Transporte{
    
    private String marca;
    private String modelo;

    public Carro(int velocidadeMax, String combustivel, int qtdCombustivel, String marca, String modelo){
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

    public String getModelo() {
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

    @Override
    public void entrar(){
        System.out.println("!! Você entrou no "+modelo+" "+marca+"!!");
    }


}
