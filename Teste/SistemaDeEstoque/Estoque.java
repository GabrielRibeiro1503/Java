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
    int respId, respQtd, respInfo, respNome = 0, respRegistrar, acharId;
    
    public Estoque(String nome, int id){
        this.qtd = 0;
        this.estado = false;
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

    public int verificId(int id){
        acharId = 0;
        for(Estoque estoque : itens){
            if(id == estoque.getId()){
                acharId = 1;
                break;
            }
        }
        return acharId;
    }

    public void cadastrar(){
        System.out.println("Digite o nome do produto: ");
        nome = scan.next();
        respNome = 0;

        for(Estoque estoque : itens){
            if(nome.equals(estoque.getNome())){
                System.out.println("Produto ja cadastrado!");
                System.out.println("Seu ID é: "+estoque.getId());
                respNome = 1;
                break;
            }
        }

        if(respNome == 0){
            estoque = new Estoque(nome, id);
            estoque.setEstado(true);
            itens.add(estoque);
            System.out.println("Produto cadastrado!");
        }
    }

    public void registrar(){
        System.out.println("1 - Registrar entrada");
        System.out.println("2 - Registrar saída");
        respRegistrar = scan.nextInt();

        switch(respRegistrar){
            case 1:
                while(true){
                    System.out.println("Digite o ID do produto que você deseja adicionar quantidade: ");
                    respId = scan.nextInt();
        
                    if(this.verificId(respId) == 1){
                        System.out.println("Esse ID equivale ao seguinte produto:");
                        System.out.println("Nome: "+estoque.getNome());
                        System.out.println("Quantidade: "+estoque.getQtd());
        
                        System.out.println("Digite a quantidade que você deseja adicionar: ");
                        respQtd = scan.nextInt();
                        estoque.setQtd(estoque.getQtd()+respQtd);
                        System.out.println("Adicionado!");
                        break;
                    }else{
                        System.out.println("Esse ID não existe!");
                    }
                }
            break;
            case 2:
                System.out.println("Digite o ID do produto que você deseja retirar quantidade: ");
                respId = scan.nextInt();

                if(this.verificId(respId) == 1){
                    System.out.println("Esse ID equivale ao seguinte produto:");
                    System.out.println("Nome: "+estoque.getNome());
                    System.out.println("Quantidade: "+estoque.getQtd());

                    System.out.println("Digite a quantidade que você deseja retirar: ");
                    respQtd = scan.nextInt();
                    if(estoque.getQtd() < respQtd){
                        System.out.println("Não há saldo suficiente para retirar, irá faltar "+(respQtd - estoque.getQtd())+" itens!");
                    }else{
                        estoque.setQtd(estoque.getQtd()-respQtd);
                        System.out.println("Retirado!");
                        break;
                    }
                }else{
                    System.out.println("Esse ID não existe!");
                }
            break;
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
                this.info();        
            break;
            
            case 2:
                while(true){
                    System.out.println("Digite o ID do produto que você deseja verificar: ");
                    respId = scan.nextInt();
        
                    if(this.verificId(respId) == 1){
                        this.info();
                        break;
                    }else{
                        System.out.println("Esse ID não existe!");
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