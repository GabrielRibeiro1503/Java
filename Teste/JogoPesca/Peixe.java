import java.util.Random;

public class Peixe {
    
    private String nome;
    private String raridade;
    private int tam;
    private int preco;
    
    Random rand = new Random();
    int randPeixe, tamPeixe, precoPeixe;
    String nomePeixe, raridadePeixe;
    

    public Peixe(int preco){
        this.nome = this.sortNome();
        this.raridade = this.raridade(getNome());
        this.tam = this.sortTam(getNome());
        this.preco = preco + this.preco(getNome());
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public int getTam(){
        return this.tam;
    }

    public void setTam(int tam){
        this.tam = tam;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tamanho: "+this.tam);
        System.out.println("Raridade: "+this.raridade);
        System.out.println("Preço: "+this.preco);
        System.out.println();
    }

    private String sortNome(){
        randPeixe = rand.nextInt(21);
        nomePeixe = null;

        if(randPeixe <= 21 && randPeixe >=17){
            nomePeixe = "Sardinha";
        } else if(randPeixe <= 15 && randPeixe >=12){
            nomePeixe = "Salmão";
        } else if(randPeixe <= 11 && randPeixe >= 7){
            nomePeixe = "Baiacu";
        } else if(randPeixe <= 6 && randPeixe >= 4){
            nomePeixe = "Bacalhau";
        } else if(randPeixe <= 3 && randPeixe >= 1){
            nomePeixe = "Linguado";
        } else if(randPeixe == 0){
            nomePeixe = "Atum";
        }

        return nomePeixe;
    }

    private int sortTam(String nome){
        switch(nome){
            case "Sardinha":
                tamPeixe = (rand.nextInt(21)) + 15;
            break;
            case "Salmão":
                tamPeixe = (rand.nextInt(31)) + 60;
            break;
            case "Baiacu":
                tamPeixe = (rand.nextInt(21)) + 20;
            break;
            case "Bacalhau":
                tamPeixe = (rand.nextInt(51)) + 50;
            break;
            case "Linguado":
                tamPeixe = (rand.nextInt(31)) + 30;
            break;
            case "Atum":
                tamPeixe = (rand.nextInt(51)) + 150;
            break;
        }

        return tamPeixe;
    }

    private String raridade(String nome){
        raridadePeixe = null;

        switch(nome){
            case "Sardinha":
                raridadePeixe = "Comum";
            break;
            case "Salmão":
                raridadePeixe = "Comum";
            break;
            case "Baiacu": 
                raridadePeixe = "Comum";
            break;
            case "Bacalhau":
                raridadePeixe = "Raro";
            break;
            case "Linguado": 
                raridadePeixe = "Raro";
            break;
            case "Atum": 
                raridadePeixe = "Épico";
            break;
        }
        
        return raridadePeixe;
    }

    private int preco(String nome){
        switch(nome){
            case "Sardinha": 
                precoPeixe += this.tam - 15;
            break;
            case "Salmão": 
                precoPeixe += this.tam - 60;
            break;
            case "Baiacu": 
                precoPeixe += this.tam - 20;
            break;
            case "Bacalhau": 
                precoPeixe += this.tam - 50;
            break;
            case "Linguado": 
                precoPeixe += this.tam - 30;
            break;
            case "Atum": 
                precoPeixe += this.tam - 150;
            break;
        }

        if(this.raridade.equals("Comum")){
            precoPeixe += 10;
        } else if (this.raridade.equals("Raro")){
            precoPeixe += 40;
        } else if (this.raridade.equals("Épico")){
            precoPeixe += 60;
        }

        return precoPeixe;
    }
}    
        