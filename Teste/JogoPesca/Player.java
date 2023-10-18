import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    private String nome;
    private int nvlMochila;
    private int nvlVara;
    private int carteira;
    private int moneyVara;

    int escolhaMar = 1, limiteMochila = 4, escolhaLoja, escolhaLoja2;

    ArrayList<Peixe> mochila = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Peixe peixe = null;

    public Player(String nome){
        this.nome = nome;
        this.nvlMochila = 1;
        this.nvlVara = 1;
        this.carteira = 0;
        this.moneyVara = 50;
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

    public int getCarteira() {
        return carteira;
    }

    public void setCarteira(int carteira) {
        this.carteira = carteira;
    }

    public int getMoneyVara() {
        return moneyVara;
    }

    public void setMoneyVara(int moneyVara) {
        this.moneyVara = moneyVara;
    }

    public void mar(){
        System.out.println("navegando");

        while(escolhaMar >= 1 && escolhaMar <= 4){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Pescar | 2 - Ver mochila | 3 - Ver informações | 4 - Voltar para a ilha");
            escolhaMar = scan.nextInt();
       
            switch(escolhaMar){
                case 1:
                    if(mochila.size() <= limiteMochila){
                        mochila.add(peixe = new Peixe(getMoneyVara()));
                        System.out.println("Add");
                    }else{
                        System.out.println("Mochila cheia!");
                    }
                break;
                case 2:
                    mochila();
                break;
                case 3:
                    info();
                break;
                case 4:
                    return;
            }
        }
    }

    public void loja(){
        System.out.println("Bem vindo a loja!");
        System.out.println("1 - Melhorar vara | 2 - Melhorar mochila | 3 - Comprar barco para zarpar | 4 - Vender peixes | 5 - Sair");
        escolhaLoja = scan.nextInt();

        switch(escolhaLoja){
            case 1:
                System.out.println("Comprar melhoria da vara por 700 moedas?");
            break;
            case 2:
                System.out.println("Comprar melhoria da mochila por 500 moedas?");
            break;
            case 3:
               System.out.println("Comprar barco por 5000 moedas?");
            break;
            case 4:
                mochila();
                System.out.println("1 - Vender Tudo | 2 - Vender Específico");
                escolhaLoja2 = scan.nextInt();

                switch(escolhaLoja2){
                    case 1:
                        for(int i = 0; i < mochila.size(); i++){
                            Peixe peixe = mochila.get(i);
                            setCarteira(getCarteira() + peixe.getPreco());
                            System.out.println(peixe.getPreco());
                            mochila.remove(i);
                            i--;
                        }
                    break;
                    case 2:
                        System.out.println();
                    break;
                }
            break;
            case 5:
                return;
        }
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
        System.out.println("Carteira: "+this.carteira);
    }
}