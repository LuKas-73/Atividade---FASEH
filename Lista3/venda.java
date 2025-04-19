package Lista3;

import java.util.Scanner;

public class venda {
    public static void executar(float valor) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nForma de pagamento");
            System.out.println("1 - PIX");
            System.out.println("2 - Cartão");
            System.out.println("3 - Dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("CÓDIGO PIX");
                    return;

                case 2:
                    System.out.print("Insira Senha: ");
                    int Senha = scanner.nextInt();
                    return;

                case 3:
                    while (true) {
                        System.out.println("Qual o valor pago?");
                        float valorpago = scanner.nextFloat();

                        float troco = valorpago - valor;

                        if (troco < 0) {
                            System.out.println("Tem que pagar mais...");
                        } else {
                            System.out.println("O troco foi: " + troco);
                            break;
                        }
                    }

                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
