import java.util.Random;

public class Peixe {
    
    private String nome;
    private int tam;
    
    Random rand = new Random();
    String[] listaPeixes = new String[6];
    int randPeixe;
    String nomePeixe;

    public Peixe(){
        this.nome = this.sortNome();
        this.tam = 5;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTam(){
        return this.tam;
    }

    public void setTam(int tam){
        this.tam = tam;
    }

    public void info(){
        System.out.println("Nome: "+this.nome);
    }

    public String sortNome(){
        listaPeixes[0] = "Salmão";
        listaPeixes[1] = "Baiacu";
        listaPeixes[2] = "Bacalhau";
        listaPeixes[3] = "Atum";
        listaPeixes[4] = "Linguado";
        listaPeixes[5] = "Sardinha";

        randPeixe = rand.nextInt(listaPeixes.length);

        for(int i = 0; i <= listaPeixes.length; i++){
            if(i == randPeixe){
                nomePeixe = listaPeixes[i];
                break;
            }
        }

        return nomePeixe;
    }

    public void sortTam(){
        switch(getNome()){
            case "Salmão":
                //60 a 90
            break;
            case "Baiacu":
                //20 a 40
            break;
            case "Bacalhau":
                //50 a 100
            break;
            case "Atum":
                //150 a 200
            break;
            case "Linguado":
                //30 a 60
            break;
            case "Sardinha":
                //15 a 25
            break;
        }
    }
}    
        