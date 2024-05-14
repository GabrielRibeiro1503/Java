
public interface InterfaceLista<T> {
    
    void inserirInicio(T itemLista); // Insere um elemento no início da lista.
    void inserirFim(T itemLista); // Insere um elemento no final da lista.
    T removerInicio(); // Remove o primeiro elemento da lista e o retorna.
    T removerFim(); // Remove o último elemento da lista e o retorna.
    Boolean vazia(); // Verifica se a lista está vazia.
    int tamanho(); // Retorna o número de elementos na lista.

}