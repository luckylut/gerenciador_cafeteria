
public class PagamentoCartao implements FormaPagamento {

    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        if (numeroCartao == null ||
                !numeroCartao.replaceAll("\\s", "").matches("\\d{4,19}")) {
            throw new IllegalArgumentException("Número de cartão inválido.");
        }

        this.numeroCartao = numeroCartao.replaceAll("\\s", "");
    }

    @Override
    public void pagar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        String finalCartao =
                numeroCartao.substring(numeroCartao.length() - 4);

        System.out.println("Pagamento no cartão processado.");
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Final do cartão: " + finalCartao);
    }
}
