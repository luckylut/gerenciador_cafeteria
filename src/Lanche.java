public class Lanche extends Produto {

    private String tipo;

    public Lanche(int id, String nome, double preco, String tipo) {
        super(id, nome, preco);
        this.tipo = tipo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nTipo: Lanche");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.printf("Preco: R$ %.2f%n", getPreco());
        System.out.println("Tipo: " + tipo);
        System.out.println("Disponivel: "
                + (isDisponivel() ? "Sim" : "Nao"));
    }
}