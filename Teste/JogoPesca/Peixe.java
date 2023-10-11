import java.util.Random;

public class Peixe {
    
    private String nome;
    
    Random rand = new Random();
    String[] nomePeixes;
    int randPeixe;
    String nomePeixe;

    public Peixe(){
        this.nome = "cleber";
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void info(){
        System.out.println("Nome: "+this.nome);
    }

    public void sortNome(){
        nomePeixes[0] = "Carpa";
        nomePeixes[1] = "Baiacu";
        nomePeixes[2] = "Bacalhau";
        nomePeixes[3] = "Atum";
        nomePeixes[4] = "Barbado";
        nomePeixes[5] = "Sardinha";
    }
}    
        