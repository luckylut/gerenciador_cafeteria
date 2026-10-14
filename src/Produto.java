public abstract class Produto {

    private int id;
    private String nome;
    private double preco;
    private boolean disponivel;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract void exibirInfo();
}