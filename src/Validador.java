
public class Validador {

    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public static boolean validarPreco(double preco) {
        return Double.isFinite(preco) && preco > 0;
    }

    public static boolean validarQuantidade(int quantidade) {
        return quantidade > 0;
    }

    public static boolean validarTelefone(String telefone) {
        if (telefone == null) {
            return false;
        }

        String numeros = telefone.replaceAll("\\D", "");
        return numeros.length() >= 10;
    }
}
