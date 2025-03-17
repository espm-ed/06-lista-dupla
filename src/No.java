public class No<T> {
    private T dado;
    private No<T> anterior;
    private No<T> proximo;

    public No(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}