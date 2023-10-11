import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    private String nome;
    private int nvlMochila;
    private int nvlVara;

    int escolha1 = 1;

    ArrayList<Peixe> mochila = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Player player = null;
    Peixe peixe = null;

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

    public void mar(){
        System.out.println("navegando");
        
        while(escolha1 >= 1 && escolha1 <= 4){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Pescar | 2 - Ver mochila | 3 - Ver informações | 4 - Voltar para a ilha");
            escolha1 = scan.nextInt();
       
            switch(escolha1){
                case 1:
                    peixe = new Peixe();
                    mochila.add(peixe);
                    System.out.println("Add");
                    peixe.sortNome();
                break;
                case 2:
                    this.mochila();
                break;
                case 3:
                    player.info();
                break;
                case 4:
                    return;
            }
        }
    }

    public void loja(){

    }

    public void mochila(){
        for(Peixe peixe : mochila){
            peixe.info();
        }
    }

    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Nível da mochila: "+this.nvlMochila);
        System.out.println("Nível da vara de pesca: "+this.nvlVara);
    }
}