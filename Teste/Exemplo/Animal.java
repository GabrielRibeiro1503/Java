package Exemplo;

public class Animal {
    private String especie;
    private float peso;
    private int idade;
    private String sexo;

    public Animal(String especie, float peso, int idade, String sexo){
        this.especie=especie;
        this.peso=peso;
        this.idade=idade;
        this.sexo=sexo;
    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void info(){
        System.out.printf("%nEspécie: %s%n",this.especie);
        System.out.printf("Peso: %f%n",this.peso);
        System.out.printf("Idade: %d%n",this.idade);
        System.out.printf("Sexo: %s%n",this.sexo);
    }
}
