package Trabalho1;

public class Navio extends Transporte{

    private String tamanho;
    private String bote_sv;
    private int durabilidade;

    public Navio(int velocidade_max, String combustivel, int qtd_combustivel, String tamanho, String bote_sv, int durabilidade){
        super(velocidade_max, combustivel, qtd_combustivel);
        this.tamanho = tamanho;
        this.bote_sv = bote_sv;
        this.durabilidade = durabilidade;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getBote_sv(){
        return bote_sv;
    }

    public void setBote_sv(String bote_sv){
        this.bote_sv = bote_sv;
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
