import java.util.Scanner;

public class AtividadeHash {

    private int limite;
    private Entrada[] entradas;
    private int tam;

    public AtividadeHash(int limite) {
        this.entradas = new Entrada[limite];
        this.tam = 0;
        this.limite = limite;
    }

    private int hash(int chave) {
        return chave % limite;
    }

    public void insercao(String value, int chave) {
        int indice = hash(chave);
        while (entradas[indice] != null && entradas[indice].getChave() != chave) {
            indice = (indice + 1) % limite;
        }

        if (entradas[indice] == null) {
            tam++;
        }

        entradas[indice] = new Entrada(chave, value);
    }

    public void remocao(int chave) {
        int indice = hash(chave);
        int indiceInicial = indice;
        while (entradas[indice] != null) {
            if (entradas[indice].getChave() == chave) {
                entradas[indice] = null;
                tam--;
                System.out.println("Chave " + chave + " removida da posição " + indice);
                return;
            }
            indice = (indice + 1) % limite;
            if (indice == indiceInicial) {
                break;
            }
        }
        System.out.println("Chave " + chave + " não encontrada para remoção");
    }

    public String busca(int chave) {
        int indice = hash(chave);
        int indiceInicial = indice;
        while (entradas[indice] != null) {
            if (entradas[indice].getChave() == chave) {
                System.out.println("Chave " + chave + " encontrada na posição " + indice);
                return entradas[indice].getValor();
            }
            indice = (indice + 1) % limite;
            if (indice == indiceInicial) {
                break;
            }
        }
        System.out.println("Chave " + chave + " não encontrada");
        return null; 
    }

    private static class Entrada {

        private final int chave;
        private final String valor;

        public Entrada(int chave, String valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public int getChave() {
            return chave;
        }

        public String getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a capacidade: ");
        int capacity = scan.nextInt();
        AtividadeHash hash = new AtividadeHash(capacity);

        hash.insercao("Teste7",7);
        hash.insercao("Teste14",14);

        System.out.println("Buscar 7: "+hash.busca(7)); 
        System.out.println("Buscar 14: "+hash.busca(14));

        hash.remocao(7);
        System.out.println("Buscar 7 após remoção: " + hash.busca(7));

    }
}