package Trabalho1;

public class Carro extends Transporte{
    
    private String marca;
    private String modelo;

    public Carro(int velocidade_max, String combustivel, int qtd_combustivel, String marca, String modelo){
        super(velocidade_max, combustivel, qtd_combustivel);
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


}
