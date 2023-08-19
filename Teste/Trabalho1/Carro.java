package Trabalho1;

public class Carro extends Transporte{
    
    private String marca;
    private String modelo;
    private Boolean entrar;

    public Carro(int velocidadeMax, String combustivel, int qtdCombustivel, String marca, String modelo){
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.marca = marca;
        this.modelo = modelo;
        this.entrar = false;
    }

    public Boolean getEntrar(){
        return entrar;
    }

    public void setEntrar(Boolean entrar){
        this.entrar = entrar;
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
        if (this.entrar == false){
            this.entrar = true;
            System.out.println("|| !! Você entrou no "+marca+" "+modelo+" !!");
        } else {
            System.out.println("|| !! Você já está dentro do carro !!");
        }    
    }

    @Override
    public void sair(){
        if (this.entrar == true){
            this.entrar = false;
            System.out.println("|| !! Você saiu do "+marca+" "+modelo+" !!");
        } else {
            System.out.println("|| !! Você já está fora do carro !!");
        }
    }

}