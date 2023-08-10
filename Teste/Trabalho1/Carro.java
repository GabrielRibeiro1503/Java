package Trabalho1;

public class Carro extends Transporte{
    
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String tipo, String trafego, int velocidade_max, String combustivel, int qtd_combustivel, String marca, String modelo, int ano){
        super(tipo, trafego, velocidade_max, combustivel, qtd_combustivel);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void info(){
        super.info();
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
    }
}
