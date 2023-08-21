package Trabalho1;

public class Navio extends Transporte{

    private String tamanho;
    private String boteSv;
    private int durabilidade;

    public Navio(int velocidadeMax, String combustivel, float qtdCombustivel, String tamanho, String boteSv, int durabilidade){
        super(velocidadeMax, combustivel, qtdCombustivel);
        this.tamanho = tamanho;
        this.boteSv = boteSv;
        this.durabilidade = durabilidade;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getBote_sv(){
        return boteSv;
    }

    public void setBote_sv(String boteSv){
        this.boteSv = boteSv;
    }

    public int getDurabilidade(){
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }
    
    public void info(){
        super.info();
        System.out.println("|| Tamanho: "+this.tamanho);
        System.out.println("|| Bote Salva Vida: "+this.tamanho);
        System.out.println("|| Durabilidade: "+this.durabilidade);
    }
}
