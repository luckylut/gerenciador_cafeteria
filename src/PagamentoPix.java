
public class PagamentoPix implements FormaPagamento {

    private String chavePix;

    public PagamentoPix(String chavePix) {
        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new IllegalArgumentException("Chave Pix inválida.");
        }

        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        System.out.println("Pagamento via Pix processado.");
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Chave Pix: " + chavePix);
    }
}
