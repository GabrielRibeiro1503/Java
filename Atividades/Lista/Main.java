public class Main {

    public static void main(String[] args){

        ListaEncadeada lista = new ListaEncadeada();

        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        Node n4 = new Node(7);

        lista.inserirInicio(n1);
        lista.inserirFim(n2);
        lista.inserirNaPosicao(1,n3);
        lista.inserirNaPosicao(5,n4);

        lista.imprimirLista();

    }

    // Classe Node
    static class Node{
    
        private int valor;
        private Node proximo;
    
        Node(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    
        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public Node getProximo() {
            return proximo;
        }
    
        public void setProximo(Node proximo) {
            this.proximo = proximo;
        }
    }

    // Classe Lista
    static class ListaEncadeada {
    
        private Node inicio;
    
        ListaEncadeada(){}
    
        // Método para obter o tamanho
        public int getTamanho() {
            Node lista = inicio;
            int tam = 0;
            while (lista != null) {
                tam++;
                lista = lista.getProximo();
            }
            return tam;
        }

        // Método para inserir no início (eu sei que não precisava, mas coloquei só para testar kk)
        public void inserirInicio(Node node){
            if(inicio == null){
                inicio = node;
            }else{
                node.setProximo(inicio);
                inicio = node;
            }
        }

        // Método para inserir no final
        public void inserirFim(Node node){
            if(inicio == null){
               inicio = node;
            }else{
               Node aux = inicio;
               while(aux.getProximo() != null){
                   aux = aux.getProximo();
               }
               aux.setProximo(node);
            }
        }

        // Método para inserir em uma posição específica
        public void inserirNaPosicao(int posicao, Node node){
            if(posicao == 0){
                inserirInicio(node);
            }else if(posicao > getTamanho()){
                inserirFim(node);
            }else{
                Node aux = inicio;
                int posicao_atual = 1;
                while(posicao > posicao_atual){
                    aux = aux.getProximo();
                    posicao_atual++;
                }
                node.setProximo(aux.getProximo());
                aux.setProximo(node);
            }
        }

        // Método para verificar a lista (também não precisava mas fiz só para testar mesmo)
        public void imprimirLista(){
            Node lista = inicio;
            while(lista != null){
                System.out.println(lista.getValor());
                lista = lista.getProximo();
            }
        }
    }
}