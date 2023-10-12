import java.util.Random;

public class Peixe {
    
    private String nome;
    private int tam;
    private String raridade;
    private int preco;
    
    Random rand = new Random();
    int randPeixe, tamPeixe, precoPeixe = 50;
    String nomePeixe, raridadePeixe;

    public Peixe(){
        this.nome = this.sortNome();
        this.tam = this.sortTam();
        this.raridade = this.raridade();
        this.preco = this.preco();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
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
        randPeixe = rand.nextInt(22);

        if(randPeixe <= 21 && randPeixe >=17){
            nomePeixe = "Carpa";
        } else if(randPeixe <= 15 && randPeixe >=12){
            nomePeixe = "Baiacu";
        } else if(randPeixe <= 11 && randPeixe >= 7){
            nomePeixe = "Bacalhau";
        } else if(randPeixe <= 6 && randPeixe >= 4){
            nomePeixe = "Atum";
        } else if(randPeixe <= 3 && randPeixe >= 1){
            nomePeixe = "Barbado";
        } else if(randPeixe == 0){
            nomePeixe = "Sardinha";
        }

        return nomePeixe;
    }

    private int sortTam(){
        switch(this.nome){
            case "Carpa": 
                tamPeixe = rand.nextInt(16) + 15;
            break;
            case "Baiacu": 
                tamPeixe = rand.nextInt(6) + 20;
            break;
            case "Bacalhau": 
                tamPeixe = rand.nextInt(21) + 60;
            break;
            case "Atum": 
                tamPeixe = rand.nextInt(11) + 40;
            break;
            case "Barbado": 
                tamPeixe = rand.nextInt(11) + 30;
            break;
            case "Sardinha": 
                tamPeixe = rand.nextInt(6) + 10;
            break;
        }

        return tamPeixe;
    }

    private String raridade(){
        switch(this.nome){
            case "Carpa": 
            case "Baiacu": 
            case "Bacalhau": 
                raridadePeixe = "Comum";
            break;
            case "Atum": 
            case "Barbado": 
                raridadePeixe = "Raro";
            break;
            case "Sardinha": 
                raridadePeixe = "Épico";
            break;
        }
        return raridadePeixe;
    }

    private int preco(){
        switch(this.nome){
            case "Carpa": 
                precoPeixe += this.tam - 15;
            break;
            case "Baiacu": 
                precoPeixe += this.tam - 20;
            break;
            case "Bacalhau": 
                precoPeixe += this.tam - 60;
            break;
            case "Atum": 
                precoPeixe += this.tam - 40;
            break;
            case "Barbado": 
                precoPeixe += this.tam - 30;
            break;
            case "Sardinha": 
                precoPeixe += this.tam - 10;
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
        