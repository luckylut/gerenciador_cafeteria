import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        int idProduto = 1;
        int idCliente = 1;
        String opcao = "";

        while (!opcao.equals("0")) {

            System.out.println("\n===== GERENCIADOR DE CAFETERIA =====");
            System.out.println("1 - Cadastrar cafe");
            System.out.println("2 - Cadastrar lanche");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Cadastrar cliente");
            System.out.println("5 - Listar clientes");
            System.out.println("6 - Alterar disponibilidade do produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextLine();

            switch (opcao) {

                case "1": {
                    System.out.print("Nome do cafe: ");
                    String nome = entrada.nextLine();

                    System.out.print("Preco: ");
                    double preco;

                    try {
                        preco = Double.parseDouble(
                                entrada.nextLine().replace(",", "."));
                    } catch (NumberFormatException e) {
                        System.out.println("Preco invalido.");
                        break;
                    }

                    System.out.print("Tamanho: ");
                    String tamanho = entrada.nextLine();

                    System.out.print("Tipo de cafe: ");
                    String tipo = entrada.nextLine();

                    if (nome.trim().isEmpty() || preco <= 0
                            || !Double.isFinite(preco)) {
                        System.out.println("Dados invalidos.");
                    } else {
                        produtos.add(new Cafe(
                                idProduto++, nome, preco, tamanho, tipo));
                        System.out.println("Cafe cadastrado com sucesso!");
                    }
                    break;
                }

                case "2": {
                    System.out.print("Nome do lanche: ");
                    String nome = entrada.nextLine();

                    System.out.print("Preco: ");
                    double preco;

                    try {
                        preco = Double.parseDouble(
                                entrada.nextLine().replace(",", "."));
                    } catch (NumberFormatException e) {
                        System.out.println("Preco invalido.");
                        break;
                    }

                    System.out.print("Tipo de lanche: ");
                    String tipo = entrada.nextLine();

                    if (nome.trim().isEmpty() || preco <= 0
                            || !Double.isFinite(preco)) {
                        System.out.println("Dados invalidos.");
                    } else {
                        produtos.add(new Lanche(
                                idProduto++, nome, preco, tipo));
                        System.out.println("Lanche cadastrado com sucesso!");
                    }
                    break;
                }

                case "3":
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n===== PRODUTOS =====");

                        for (Produto produto : produtos) {
                            produto.exibirInfo();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case "4": {
                    System.out.print("Nome do cliente: ");
                    String nome = entrada.nextLine();

                    System.out.print("Telefone do cliente: ");
                    String telefone = entrada.nextLine();

                    if (nome.trim().isEmpty() || telefone.trim().isEmpty()) {
                        System.out.println("Preencha todos os campos.");
                    } else {
                        clientes.add(new Cliente(
                                idCliente++, nome, telefone));
                        System.out.println("Cliente cadastrado com sucesso!");
                    }
                    break;
                }

                case "5":
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        System.out.println("\n===== CLIENTES =====");

                        for (Cliente cliente : clientes) {
                            cliente.exibirInfo();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case "6": {
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("ID do produto: ");
                    int id;

                    try {
                        id = Integer.parseInt(entrada.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ID invalido.");
                        break;
                    }

                    Produto encontrado = null;

                    for (Produto produto : produtos) {
                        if (produto.getId() == id) {
                            encontrado = produto;
                            break;
                        }
                    }

                    if (encontrado == null) {
                        System.out.println("Produto nao encontrado.");
                    } else {
                        System.out.println("Produto: " + encontrado.getNome());
                        System.out.println("Disponivel: "
                                + (encontrado.isDisponivel() ? "Sim" : "Nao"));
                        System.out.println("1 - Disponivel");
                        System.out.println("2 - Indisponivel");
                        System.out.print("Escolha: ");

                        String escolha = entrada.nextLine();

                        if (escolha.equals("1")) {
                            encontrado.setDisponivel(true);
                            System.out.println("Produto disponivel!");
                        } else if (escolha.equals("2")) {
                            encontrado.setDisponivel(false);
                            System.out.println("Produto indisponivel!");
                        } else {
                            System.out.println("Opcao invalida.");
                        }
                    }
                    break;
                }

                case "0":
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
    }
}