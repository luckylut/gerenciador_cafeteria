public class Cafe extends Produto {

    private String tamanho;
    private String tipo;

    public Cafe(int id, String nome, double preco,
                String tamanho, String tipo) {
        super(id, nome, preco);
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nTipo: Cafe");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.printf("Preco: R$ %.2f%n", getPreco());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tipo: " + tipo);
        System.out.println("Disponivel: "
                + (isDisponivel() ? "Sim" : "Nao"));
    }
}