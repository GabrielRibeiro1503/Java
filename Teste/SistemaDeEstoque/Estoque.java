import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    Scanner scan = new Scanner(System.in);
    ArrayList<Estoque> itens = new ArrayList<>();

    private int id;
    private int qtd;
    private String nome;
    private Boolean estado;

    Estoque estoque = null;
    int respId, respQtd, respInfo;
    
    public Estoque(String nome, int id, Boolean estado){
        this.qtd = 0;
        this.estado = estado;
        this.id = id;
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getQtd(){
        return this.qtd;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Boolean getEstado(){
        return this.estado;
    }

    public void setEstado(Boolean estado){
        this.estado = estado;
    }

    public void cadastrar(){
        System.out.println("Digite o nome do produto: ");
        nome = scan.next();

        estoque = new Estoque(nome, ++id, true);
        itens.add(estoque);
    }

    public void add(){
        System.out.println("Digite o ID do produto que você deseja adicionar quantidade: ");
        respId = scan.nextInt();

        System.out.println("Digite a quantidade que você deseja adicionar: ");
        respQtd = scan.nextInt();

        for(Estoque estoque : itens){
            if(respId == estoque.getId()){
                estoque.setQtd(estoque.getQtd()+respQtd);
                System.out.println("Adicionado!");
                break;
            }
        }
    }

    public void retirar(){
        System.out.println("Digite o ID do produto que você deseja retirar quantidade: ");
        respId = scan.nextInt();

        System.out.println("Digite a quantidade que você deseja retirar: ");
        respQtd = scan.nextInt();

        for(Estoque estoque : itens){
            if(respId == estoque.getId()){
                if(estoque.getQtd() < respQtd){
                    System.out.println("Não há saldo suficiente para retirar, irá faltar "+(respQtd - estoque.getQtd())+" itens!");
                }else{
                    estoque.setQtd(estoque.getQtd()-respQtd);
                    System.out.println("Retirado!");
                    break;
                }
            }
        }
    }

    public void info(){
        for(Estoque estoque : itens){
            System.out.println("Nome: "+estoque.getNome());
            System.out.println("ID: "+estoque.getId());
            System.out.println("Quantidade: "+estoque.getQtd());
            System.out.println("Estado: "+estoque.getEstado());
        }
    }

    public void verificar(){
        System.out.println("O que deseja verificar?");
        System.out.println("1 - Verificar lista de itens");
        System.out.println("2 - Verificar item específico");
        respInfo = scan.nextInt();

        switch(respInfo){
            case 1:
                estoque.info();
            break;
            
            case 2:
                System.out.println("Digite o ID do item desejado: ");
                respId = scan.nextInt();

                for(Estoque estoque : itens){
                    if(respId == estoque.getId()){
                        estoque.info();
                    }
                }
            break;
        }
    }

    public void excluir(){
        System.out.println("Digite o ID do produto que você deseja desativar: ");
        respId = scan.nextInt();
        
        for(Estoque estoque : itens){
            if(respId == estoque.getId() && estoque.getEstado() == true){
                estoque.setEstado(false);
                System.out.println("Seu produto foi desativado");
            }else if(estoque.getEstado() == false){
                System.out.println("O item já foi excluído");
            }
        }
    }
}