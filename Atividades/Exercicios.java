import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nEscolha o exercício que deseja executar:");
            System.out.println("2 - Exercicio");
            System.out.println("3 - Exercicio");
            System.out.println("4 - Exercicio");
            System.out.println("5 - Exercicio");
            System.out.println("7 - Exercicio");
            System.out.println("8 - Exercicio");
            System.out.println("9 - Exercicio");
            System.out.println("10 - Exercicio");
            System.out.println("11 - Exercicio");
            System.out.println("12 - Exercicio");
            System.out.println("13 - Exercicio");
            System.out.println("14 - Exercicio");
            System.out.println("15 - Exercicio");
            System.out.println("16 - Exercicio");
            System.out.println("17 - Exercicio");
            System.out.println("18 - Exercicio");
            System.out.println("19 - Exercicio");
            System.out.println("20 - Exercicio");
            System.out.println("21 - Exercicio");
            System.out.println("0 - Sair");
            System.out.print("Digite o número da opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
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
                case 7:
                    Ex7.executar();
                    break;
                case 8:
                    Ex8.executar();
                    break;
                case 9:
                    Ex9.executar();
                    break;
                case 10:
                    Ex10.executar();
                    break;
                case 11:
                    Ex11.executar();
                    break;
                case 12:
                    Ex12.executar();
                    break;
                case 13:
                    Ex13.executar();
                    break;
                case 14:
                    Ex14.executar();
                    break;
                case 15:
                    Ex15.executar();
                    break;
                case 16:
                    Ex16.executar();
                    break;
                case 17:
                    Ex17.executar();
                    break;
                case 18:
                    Ex18.executar();
                    break;
                case 19:
                    Ex19.executar();
                    break;
                case 20:
                    Ex20.executar();
                    break;
                case 21:
                    Ex21.executar();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true);
    }
}
