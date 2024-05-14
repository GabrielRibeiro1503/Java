import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fila<T> implements InterfaceFila<T> {

    private List<T> itensFila;

    public Fila(){
        this.itensFila = new ArrayList<>();
    }

    @Override
    public void enfileirar(T itemFila) {
        itensFila.add(itemFila);
    }

    @Override
    public T desenfileirar() {
        T retornar = itensFila.remove(0);
        return retornar;
    }

    @Override
    public boolean isVazia() {
        return itensFila.isEmpty();
    }

    @Override
    public int tamanho() {
        return itensFila.size();
    }

    @Override
    public void inverter(){
        List<T> filaInvertida = new ArrayList<>();
        int tam = itensFila.size();
        for(int i = tam - 1; i >= 0; i--){
            filaInvertida.add(itensFila.get(i));
        }
        for (T itemInvetido : filaInvertida) {
            System.out.println(itemInvetido);
        }
    }

    public void imprimir(){
        for (T itemLista : itensFila) {
            System.out.println(itemLista);
        }
    }

    public void ordenarFila() {
        Collections.sort(itensFila, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return ((Comparable<T>) o1).compareTo(o2);
            }
        });
    }

}

/* 

Ex5: Crie um método ordenarFila(Fila<Integer> fila) que ordena
os elementos de uma fila de inteiros em ordem crescente,
utilizando apenas uma fila adicional.
 */