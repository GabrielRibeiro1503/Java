public interface InterfaceFila<T> {
    void enfileirar(T itemFila); // Adiciona um elemento à pilha.
    T desenfileirar(); // Remove o último elemento da pilha e o retorna.
    boolean isVazia(); // Verifica se a pilha está vazia.
    int tamanho(); // Retorna o número de elementos na pilha. 
    void inverter(); // Inverte a ordem dos elementos em uma fila.
}