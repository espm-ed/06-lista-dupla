public class ListaDupla<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;

    }

    // método para inserir um nó no final da lista
    public void inserir(T dado) {
        No<T> aux = new No<>(dado);
        if(estaVazia()) {
            inicio = aux;            
        }
        else {
            aux.setAnterior(fim);
            fim.setProximo(aux);
        }
        fim = aux;
        tamanho++;
    }

    // método para imprimir os elementos da lista
    public void imprimir() {
        No<T> aux = inicio;
        while(aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getProximo();
        }
    }

    // método que recebe um objeto e retornar o seu endereço (caso exista)
    public No<T> pesquisar(T dado) {
        No<T> aux = fim;
        while(aux != null) {
            if(aux.getDado().equals(dado)) {
                return aux;
            }
            aux = aux.getAnterior();
        }
        return null;
    }

    // método para verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // método para remover um nó
    public void remover(T dado) {
        No<T> aux = pesquisar(dado);
        if(aux != null) {
            // caso 1 --> a lista tem apenas 1 nó
            if(tamanho == 1) {
                inicio = null;
                fim = null;                
            }
            else {
                // caso 2 --> o nó é o primeiro 
                if(aux == inicio) {
                    inicio = inicio.getProximo();
                    aux.setProximo(null);
                    inicio.setAnterior(null);
                }
                else {
                    // caso 3 --> o nó é o último
                    if(aux == fim) {
                        fim = fim.getAnterior();
                        aux.setAnterior(null);
                        fim.setProximo(null);
                    }
                    else {
                        // caso 4 --> o nó não é nem o primeiro e nem o último
                        aux.getAnterior().setProximo(aux.getProximo());
                        aux.getProximo().setAnterior(aux.getAnterior());
                        aux.setAnterior(null);
                        aux.setProximo(null);
                    }
                }
            }
            aux = null;
            tamanho--;
        }
    }


    // método para inserir um objeto em uma posição específica
    
}
