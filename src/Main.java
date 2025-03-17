public class Main {
    public static void main(String[] args) {
        
        ListaDupla<Produto> lista = new ListaDupla<>();
        lista.inserir(new Produto("batata", 15));
        lista.inserir(new Produto("café", 70));

        lista.imprimir();

    }
}
