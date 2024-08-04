public class Main {

    public static class Node {
        int chave;
        Node left, right;
    
        public Node(int item) {
            chave = item;
            left = right = null;
        }
    }
    
    public static class Arvore {
        Node rota;
    
        Arvore() {
            rota = null; 
        }
    
        void inserir(int chave) {
            rota = inserirRec(rota, chave);
        }
    
        Node inserirRec(Node rota, int chave) {
            if (rota == null) {
                rota = new Node(chave);
                return rota;
            }
    
            if (chave < rota.chave) {
                rota.left = inserirRec(rota.left, chave);
            } else if (chave > rota.chave) {
                rota.right = inserirRec(rota.right, chave);
            }
    
            return rota;
        }
    
        void inorder() {
            inorderRec(rota);
        }
    
        void inorderRec(Node rota) {
            if (rota != null) {
                inorderRec(rota.left);
                System.out.print(rota.chave + " ");
                inorderRec(rota.right);
            }
        }
    }    

    public static void main(String[] args) {
        Arvore arv = new Arvore();

        arv.inserir(20);
        arv.inserir(60);
        arv.inserir(70);
        arv.inserir(10);

        System.out.println("Ordem da árvore binária:");
        arv.inorder();
    }
}