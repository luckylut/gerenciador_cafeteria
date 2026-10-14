
public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null || quantidade <= 0) {
            throw new IllegalArgumentException("Item ou quantidade inválida.");
        }

        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Subtotal: R$ %.2f%n", calcularSubtotal());
    }
}
