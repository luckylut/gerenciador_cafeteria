
public class Cliente {

    private int id;
    private String nome;
    private String telefone;

    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        if (Validador.validarNome(nome)) {
            this.nome = nome;
        }
    }

    public void setTelefone(String telefone) {
        if (Validador.validarTelefone(telefone)) {
            this.telefone = telefone;
        }
    }

    public void exibirInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
