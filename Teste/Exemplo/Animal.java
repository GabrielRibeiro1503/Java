package Exemplo;

public class Animal {
    private String especie;
    private float peso;
    private int idade;
    private String sexo;
    private String raca;

    public Animal(String especie, float peso, int idade, String sexo, String raca){
        this.especie=especie;
        this.peso=peso;
        this.idade=idade;
        this.sexo=sexo;
        this.raca=raca;
    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public float getPeso(){
        System.out.printf("%nO peso atual é de: %f%n",this.peso);
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public int getIdade(){
        System.out.printf("%nA sua idade agora é: %f%n",this.idade);
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

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void comer(){
        System.out.printf("%nO animal está se alimentando!%n");
        this.peso++;
    }

    public void aniversario(){
        System.out.printf("%nO animal fez aniversário!%n");
        this.idade++;
    }

    public void info(){
        System.out.printf("%nEspécie: %s%n",this.especie);
        System.out.printf("Peso: %f%n",this.peso);
        System.out.printf("Idade: %d%n",this.idade);
        System.out.printf("Sexo: %s%n",this.sexo);
        System.out.printf("Raça: %s%n",this.raca);
    }
}
