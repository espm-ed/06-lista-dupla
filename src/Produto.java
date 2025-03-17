public class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }  
    
    // override do toString()
    @Override
    public String toString() {
        return nome + " -- " + valor;
    }

}
