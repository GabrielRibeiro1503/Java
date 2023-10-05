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
    int respId, respQtd, respInfo, respNome, respRegistrar, respRemv, acharId;
    
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

    // 1 - Funções 
    // 1.1 - Função para reduzir a chamada de informações

    public void info(){
        for(Estoque estoque : itens){
            System.out.println("||==================================================||");
            System.out.println("|| Nome: "+estoque.getNome());
            System.out.println("|| ID: "+estoque.getId());
            System.out.println("|| Quantidade: "+estoque.getQtd());
            System.out.println("|| Estado: "+ (estoque.getEstado() ? "Ativo" : "Desativo"));
        }
    }

    // 2 - Funcionalidades do sistema 
    // 2.1 - Cadastrar produto

    public void cadastrar(){
        System.out.println("||==================================================||");
        System.out.println("|| <- 5            -- Cadastrar --                  ||");
        System.out.println("||=======================++=========================||");
        System.out.print("|| Digite o nome do produto: ");
        nome = scan.next();

        if(nome.equals("5")){
            return; 
        }

        System.out.println("||                 -- Cadastrar --                  ||");
        System.out.println("||=======================++=========================||");
        System.out.print("|| Digite o nome do produto: ");
        nome = scan.next();

        respNome = 0;
        for(Estoque estoque : itens){
            if(nome.equals(estoque.getNome())){
                System.out.println("|| Produto ja cadastrado!");
                System.out.println("|| Seu ID é: "+estoque.getId());
                respNome = 1;
                break;
            }
        }
        if(respNome == 0){
            estoque = new Estoque(nome, ++id);
            estoque.setEstado(true);
            itens.add(estoque);
            System.out.println("|| Produto cadastrado!");
        }
    }

    // 2.2 - Resgistrar entrada e saída de itens do produto

    public void registrar(){
<<<<<<< HEAD
        while(true){
            System.out.println("||==================================================||");
            System.out.println("|| <- 5            -- Registrar --                  ||");
            System.out.println("||=======================++=========================||");
            System.out.println("|| 1 - Registrar entrada ||   2 - Registrar saída   ||");
            System.out.println("||=======================++=========================||");
            System.out.print("|} ");
            respRegistrar = scan.nextInt();

            if(respRegistrar == 5){
                return; 
            }

            switch(respRegistrar){
                case 1:
                    System.out.println("||==================================================||");
                    System.out.print("|| Digite o ID do produto para adicionar itens: ");
                    respId = scan.nextInt();
                    
                    acharId = 0;
                    for(Estoque estoque : itens){
                        if(respId == estoque.getId() && estoque.getEstado() == true){
                            System.out.println("|| Esse ID equivale ao seguinte produto:");
                            System.out.println("|| Nome: "+estoque.getNome());
                            System.out.println("|| Quantidade: "+estoque.getQtd());
            
                            System.out.println("||==================================================||");
                            System.out.print("|| Digite a quantidade para adicionar: ");
                            respQtd = scan.nextInt();
                            estoque.setQtd(estoque.getQtd()+respQtd);
                            System.out.println("|| Adicionado!");
                            return;
                        }else if(respId == estoque.getId() && estoque.getEstado() == false){
                            System.out.println("|| Esse produto está desativado!");
                            System.out.println("|| Ative primeiro antes de modificar!");
                            return;
                        }else{
                            acharId++;
                            continue;
                        }
                    }
                    if(acharId == itens.size()){
                        System.out.println("|| Esse ID não existe!");
                    }
                break;
                case 2:
                    System.out.println("||==================================================||");
                    System.out.print("|| Digite o ID do produto para retirar itens: ");
                    respId = scan.nextInt();

                    acharId = 0;
                    for(Estoque estoque : itens){
                        if(respId == estoque.getId() && estoque.getEstado() == true){
                            System.out.println("|| Esse ID equivale ao seguinte produto:");
                            System.out.println("|| Nome: "+estoque.getNome());
                            System.out.println("|| Quantidade: "+estoque.getQtd());

                            System.out.println("||==================================================||");
                            System.out.print("|| Digite a quantidade para retirar: ");
                            respQtd = scan.nextInt();
                            if(estoque.getQtd() < respQtd){
                                System.out.println("|| Não há saldo suficiente para retirar!");
                                System.out.println("|| Irá faltar "+(respQtd - estoque.getQtd())+" itens!");
                            }else{
                                estoque.setQtd(estoque.getQtd()-respQtd);
                                System.out.println("|| Retirado!");
                                return;
                            }
                        }else if(respId == estoque.getId() && estoque.getEstado() == false){
                            System.out.println("|| Esse produto está desativado!");
                            System.out.println("|| Ative primeiro antes de modificar!");
                            return;
                        }else{
                            acharId++;
                            continue;
                        }
                    }
                    if(acharId == itens.size()){
                        System.out.println("|| Esse ID não existe!");
                    }
                break;
            }
=======
        System.out.println("||==================================================||");
        System.out.println("||                 -- Registrar --                  ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 1 - Registrar entrada ||   2 - Registrar saída   ||");
        System.out.println("||=======================++=========================||");
        System.out.print("||> ");
        respRegistrar = scan.nextInt();

        switch(respRegistrar){
            case 1:
                System.out.println("||==================================================||");
                System.out.print("|| Digite o ID do produto para adicionar itens: ");
                respId = scan.nextInt();
                
                acharId = 0;
                for(Estoque estoque : itens){
                    if(respId == estoque.getId() && estoque.getEstado() == true){
                        System.out.println("|| Esse ID equivale ao seguinte produto:");
                        System.out.println("|| Nome: "+estoque.getNome());
                        System.out.println("|| Quantidade: "+estoque.getQtd());
        
                        System.out.print("|| Digite a quantidade para adicionar: ");
                        respQtd = scan.nextInt();
                        estoque.setQtd(estoque.getQtd()+respQtd);
                        System.out.println("|| Adicionado!");
                        break;
                    }else if(respId == estoque.getId() && estoque.getEstado() == false){
                        System.out.println("|| Esse produto está desativado!");
                        System.out.println("|| Ative primeiro antes de modificar!");
                        break;
                    }else{
                        acharId++;
                        continue;
                    }
                }
                if(acharId == itens.size()){
                    System.out.println("|| Esse ID não existe!");
                }
            break;
            case 2:
                System.out.println("||==================================================||");
                System.out.print("|| Digite o ID do produto para retirar itens: ");
                respId = scan.nextInt();

                acharId = 0;
                for(Estoque estoque : itens){
                    if(respId == estoque.getId() && estoque.getEstado() == true){
                        System.out.println("|| Esse ID equivale ao seguinte produto:");
                        System.out.println("|| Nome: "+estoque.getNome());
                        System.out.println("|| Quantidade: "+estoque.getQtd());

                        System.out.print("|| Digite a quantidade para retirar: ");
                        respQtd = scan.nextInt();
                        if(estoque.getQtd() < respQtd){
                            System.out.println("|| Não há saldo suficiente para retirar!");
                            System.out.println("|| Irá faltar "+(respQtd - estoque.getQtd())+" itens!");
                        }else{
                            estoque.setQtd(estoque.getQtd()-respQtd);
                            System.out.println("|| Retirado!");
                            break;
                        }
                    }else if(respId == estoque.getId() && estoque.getEstado() == false){
                        System.out.println("|| Esse produto está desativado!");
                        System.out.println("|| Ative primeiro antes de modificar!");
                        break;
                    }else{
                        acharId++;
                        continue;
                    }
                }
                if(acharId == itens.size()){
                    System.out.println("|| Esse ID não existe!");
                }
            break;
>>>>>>> 7fa700ea74150d67571914565ab9f6dc87d8497c
        }
    }

    // 2.3 - Verificar lista de produto ou um produto específico

    public void verificar(){
<<<<<<< HEAD
        while(true){
            System.out.println("||==================================================||");
            System.out.println("|| <- 5            -- Verificar --                  ||");
            System.out.println("||=======================++=========================||");
            System.out.println("||  1 - Verificar lista  ||  2 - Verificar produto  ||");
            System.out.println("||=======================++=========================||");
            System.out.print("|} ");
            respInfo = scan.nextInt();

            if(respInfo == 5){
                return; 
            }

            switch(respInfo){
                case 1:
                    if(itens.size() == 0){
                        System.out.println("||==================================================||");
                        System.out.println("|| Nenhum produto cadastrado!");
                        return;
                    }else{
                        this.info();
                        return;
                    }
                case 2:
                    if(itens.size() == 0){
                        System.out.println("||==================================================||");
                        System.out.println("|| Nenhum produto cadastrado!");
                        return;
                    }else{
                        System.out.println("||==================================================||");
                        System.out.print("|| Digite o ID do produto para verificar: ");
                        respId = scan.nextInt();
            
                        acharId = 0;
                        for(Estoque estoque : itens){
                            if(respId == estoque.getId()){
                                this.info();
                            return;
                            }else{
                                acharId++;
                                continue;
                            }
                        }
                        if(acharId == itens.size()){
                            System.out.println("|| Esse ID não existe!");
                        }
                    }  
                    
                break;
            }
=======
        System.out.println("||==================================================||");
        System.out.println("||                 -- Verificar --                  ||");
        System.out.println("||=======================++=========================||");
        System.out.println("||  1 - Verificar lista  ||  2 - Verificar produto  ||");
        System.out.println("||=======================++=========================||");
        System.out.print("||> ");
        respInfo = scan.nextInt();

        switch(respInfo){
            case 1:
                this.info();        
            break;
            case 2:
                System.out.println("||==================================================||");
                System.out.print("|| Digite o ID do produto para verificar: ");
                respId = scan.nextInt();
    
                acharId = 0;
                for(Estoque estoque : itens){
                    if(respId == estoque.getId()){
                        this.info();
                    break;
                    }else{
                        acharId++;
                        continue;
                    }
                }
                if(acharId == itens.size()){
                    System.out.println("|| Esse ID não existe!");
                }
            break;
>>>>>>> 7fa700ea74150d67571914565ab9f6dc87d8497c
        }
    }

    // 2.4 - Desativa e ativa um produto

    public void excluir(){
<<<<<<< HEAD
        while(true){
            System.out.println("||==================================================||");
            System.out.println("|| <- 5             -- Excluir --                   ||");
            System.out.println("||=======================++=========================||");
            System.out.println("|| 1 - Desativar produto ||   2 - Ativar produto    ||");
            System.out.println("||=======================++=========================||");
            System.out.print("|} ");
            respRemv = scan.nextInt();

            if(respRemv == 5){
                return; 
            }

            switch(respRemv){
                case 1:
                    System.out.println("||==================================================||");
                    System.out.print("|| Digite o ID do produto para desativar: ");
                    respId = scan.nextInt();

                    acharId = 0;
                    for(Estoque estoque : itens){
                        if(respId == estoque.getId() && estoque.getEstado() == true){
                            estoque.setEstado(false);
                            System.out.println("|| Seu produto foi desativado!");
                            return;
                        }else if(respId == estoque.getId() && estoque.getEstado() == false){
                            System.out.println("|| O produto já está desativado!");
                            return;
                        }else{
                            acharId++;
                            continue;
                        }
                    }
                    if(acharId == itens.size()){
                        System.out.println("|| Esse ID não existe!");
                    }
                break;
                case 2:
                    System.out.println("||==================================================||");
                    System.out.print("|| Digite o ID do produto para ativar: ");
                    respId = scan.nextInt();

                    acharId = 0;
                    for(Estoque estoque : itens){
                        if(respId == estoque.getId() && estoque.getEstado() == false){
                            estoque.setEstado(true);
                            System.out.println("|| Seu produto foi ativado!");
                            return;
                        }else if(respId == estoque.getId() && estoque.getEstado() == true){
                            System.out.println("|| O produto já está ativado!");
                            return;
                        }else{
                            acharId++;
                            continue;
                        }
                    }
                    if(acharId == itens.size()){
                        System.out.println("|| Esse ID não existe!");
                    }
                break;
            }
=======
        System.out.println("||==================================================||");
        System.out.println("||                  -- Excluir --                   ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 1 - Desativar produto ||   2 - Ativar produto    ||");
        System.out.println("||=======================++=========================||");
        System.out.print("||> ");
        respRemv = scan.nextInt();

        switch(respRemv){
            case 1:
                System.out.println("||==================================================||");
                System.out.print("|| Digite o ID do produto para desativar: ");
                respId = scan.nextInt();

                acharId = 0;
                for(Estoque estoque : itens){
                    if(respId == estoque.getId() && estoque.getEstado() == true){
                        estoque.setEstado(false);
                        System.out.println("|| Seu produto foi desativado!");
                        break;
                    }else if(respId == estoque.getId() && estoque.getEstado() == false){
                        System.out.println("|| O produto já está desativado!");
                        break;
                    }else{
                        acharId++;
                        continue;
                    }
                }
                if(acharId == itens.size()){
                    System.out.println("|| Esse ID não existe!");
                }
            break;
            case 2:
                System.out.println("||==================================================||");
                System.out.print("|| Digite o ID do produto para ativar: ");
                respId = scan.nextInt();

                acharId = 0;
                for(Estoque estoque : itens){
                    if(respId == estoque.getId() && estoque.getEstado() == false){
                        estoque.setEstado(true);
                        System.out.println("|| Seu produto foi ativado!");
                        break;
                    }else if(respId == estoque.getId() && estoque.getEstado() == true){
                        System.out.println("|| O produto já está ativado!");
                        break;
                    }else{
                        acharId++;
                        continue;
                    }
                }
                if(acharId == itens.size()){
                    System.out.println("|| Esse ID não existe!");
                }
            break;
>>>>>>> 7fa700ea74150d67571914565ab9f6dc87d8497c
        }
    }
}