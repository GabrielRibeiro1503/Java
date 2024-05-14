import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        // Teste da lista

        Lista<Integer> lista = new Lista<>();  

        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserirFim(4);
        lista.inserirInicio(1);

        lista.removerFim();
        lista.removerInicio();

        lista.imprimir();

        System.out.println(lista.vazia());
        System.out.println(lista.tamanho());

        // Teste da Fila

        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(5);
        fila.enfileirar(2);
        fila.enfileirar(9);
        fila.enfileirar(1);

        fila.inverter();
        fila.imprimir();
        fila.ordenarFila();
        fila.imprimir();

        // Teste Verificar Palindromo 

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra para vermos se é palindromo: ");
        String palavra = scan.nextLine();

        System.out.println(verificarPalindromo(palavra));
        

    }

    public static boolean verificarPalindromo(String palavra) {
        List<Character> listaCaracteres = new ArrayList<>();

        for (char caracteres : palavra.toCharArray()) {
            if (Character.isLetterOrDigit(caracteres)) {
                listaCaracteres.add(caracteres);
            }
        }

        int começo = 0;
        int fim = listaCaracteres.size() - 1;
        while (começo < fim) {
            if (!listaCaracteres.get(começo).equals(listaCaracteres.get(fim))) {
                return false;
            }
            começo++;
            fim--;
        }
        return true;
    }

}