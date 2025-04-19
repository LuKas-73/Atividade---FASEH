package Lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> Produtos = new ArrayList<>();
        int QuantidadeItens = 0;
        int CodigoProduto;
        float valor;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Alterar Produto");
            System.out.println("3 - Excluir Produto");
            System.out.println("4 - Exibir Prdoutos");
            System.out.println("5 - Venda");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    QuantidadeItens++;
                    System.out.print("Nome do produto: ");
                    String NomeProduto = scanner.nextLine();
                    System.out.print("Valor unitário do produto: ");
                    float ValorProduto = scanner.nextFloat();
                    System.out.print("Tipo do produto: ");
                    String TipoProduto = scanner.nextLine();
                    scanner.nextLine();
                    Produtos.add(new Produto(NomeProduto, QuantidadeItens, ValorProduto, TipoProduto));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    CodigoProduto = scanner.nextInt();
                    scanner.nextLine();
                    boolean encontrado = false;
                    for (Produto p : Produtos) {
                        if (p.getCodigo() == CodigoProduto) {
                            System.out.print("Novo nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Novo valor: ");
                            float novoValor = scanner.nextFloat();
                            scanner.nextLine();
                            System.out.print("Novo tipo: ");
                            String novoTipo = scanner.nextLine();

                            p.setNome(novoNome);
                            p.setValor(novoValor);
                            p.setTipo(novoTipo);
                            System.out.println("Produto alterado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do produto: ");
                    CodigoProduto = scanner.nextInt();
                    scanner.nextLine();
                    Produto produtoParaRemover = null;
                    for (Produto p : Produtos) {
                        if (p.getCodigo() == CodigoProduto) {
                            produtoParaRemover = p;
                            break;
                        }
                    }
                    if (produtoParaRemover != null) {
                        Produtos.remove(produtoParaRemover);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Produtos ---");
                    if (Produtos.isEmpty()) {
                        System.out.println("Nenhum produto ainda cadastrado.");
                    } else {
                        for (Produto p : Produtos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Insira o código do item a comprar:");
                    CodigoProduto = scanner.nextInt();
                    scanner.nextLine();
                    for (Produto p : Produtos) {
                        if (p.getCodigo() == CodigoProduto) {
                            valor = p.getValor();
                            venda.executar(valor);
                        }
                    }

                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
