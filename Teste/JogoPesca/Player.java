public class Player {
    
    private String nome;
    private int nvlMochila;
    private int nvlVara;

    public Player(String nome){
        this.nome = nome;
        this.nvlMochila = 1;
        this.nvlVara = 1;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNvlMochila(){
        return this.nvlMochila;
    }

    public void setNvlMochila(int nvlMochila){
        this.nvlMochila = nvlMochila;
    }

    public int getNvlVara(){
        return this.nvlVara;
    }

    public void setNvlVara(int nvlVara){
        this.nvlVara = nvlVara;
    }

    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Nível da mochila: "+this.nvlMochila);
        System.out.println("Nível da vara de pesca: "+this.nvlVara);
    }
}