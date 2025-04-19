package Lista3;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nEscolha o exercício que deseja executar:");
            System.out.println("1 - Exercicio");
            System.out.println("2 - Exercicio");
            System.out.println("3 - Exercicio");
            System.out.println("4 - Exercicio");
            System.out.println("5 e 6 - Exercicio");
            System.out.println("7 - Exercicio");
            System.out.println("0 - Sair");
            System.out.print("Digite o número da opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    Ex1.executar();
                    break;
                case 2:
                    Ex2.executar();
                    break;
                case 3:
                    Ex3.executar();
                    break;
                case 4:
                    Ex4.executar();
                    break;
                case 5:
                    Ex5.executar();
                    break;
                case 6:
                    Ex5.executar();
                    break;
                case 7:
                    Ex7.executar();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true);
    }
}
