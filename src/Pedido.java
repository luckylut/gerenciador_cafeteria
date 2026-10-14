
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private String status;

    public Pedido(int id, Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }

        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = "Em aberto";
    }

    public void adicionarItem(ItemPedido item) {
        if (item != null && status.equals("Em aberto")) {
            itens.add(item);
        } else {
            System.out.println("Não foi possível adicionar o item.");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void finalizar() {
        if (!itens.isEmpty() && status.equals("Em aberto")) {
            status = "Finalizado";
            System.out.println("Pedido finalizado!");
        } else {
            System.out.println("Pedido vazio ou já finalizado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Pedido: " + id);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Status: " + status);

        for (ItemPedido item : itens) {
            item.exibirInfo();
        }

        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}
