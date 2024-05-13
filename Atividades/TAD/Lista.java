import java.util.ArrayList;
import java.util.List;

public class Lista<T> implements InterfaceLista<T> {

    private List<T> itensLista;

    public Lista(){
        this.itensLista = new ArrayList<>();
    }

    @Override
    public void inserirInicio(T itemLista) {
        itensLista.add(0, itemLista);
    }

    @Override
    public void inserirFim(T itemLista) {
        itensLista.add(itemLista);
    }

    @Override
    public T removerInicio() {
        T retornar = itensLista.remove(0);
        return retornar;
    }

    @Override
    public T removerFim() {
        T retornar = itensLista.remove(itensLista.size() - 1);
        return retornar;
    }

    @Override
    public Boolean vazia() {
        return itensLista.isEmpty();
    }

    @Override
    public int tamanho() {
        return itensLista.size();
    }

    public void imprimir(){
        for (T itemLista : itensLista) {
            System.out.println(itemLista);
        }
    }
    
}
