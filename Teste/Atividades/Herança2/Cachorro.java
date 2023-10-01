package Exemplo;

public class Cachorro extends Animal {
    
    private String funcionalidade;

    public Cachorro(String especie, float peso, int idade, String sexo, String raca, String funcionalidade){
        super(especie, peso, idade, sexo, raca);
        this.funcionalidade=funcionalidade;
    }

    public String getFuncionalidade(){
        return this.funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public void latir(){
        System.out.printf("%nRouff, o cachorro está latindo!%n");
    }

    public void info(){
        super.info();
        System.out.printf("Funcionalidade: %s%n", this.funcionalidade);
    }
}
