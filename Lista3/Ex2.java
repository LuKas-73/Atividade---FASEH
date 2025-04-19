package Lista3;

import java.util.Scanner;

public class Ex2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        float Nota1, Nota2, Nota3;
        float Peso1, Peso2, Peso3;
        float Media;
        do {
            System.out.println("\nEscolha o exercício que deseja executar:");
            System.out.println("1 - Media Aritmetica");
            System.out.println("2 - Media Ponderada");
            System.out.println("3 - Sair");
            System.out.print("Digite o número da opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 3) {
                System.out.println("Voltando ao Menu");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("DIGITE A PRIMEIRTA NOTA:");
                    Nota1 = scanner.nextFloat();
                    System.out.println("DIGITE A SEGUNDA NOTA:");
                    Nota2 = scanner.nextFloat();

                    Media = (Nota1 + Nota2) / 2;

                    System.out.println("A MEDIA EH: " + Media);
                    break;
                case 2:
                    System.out.println("DIGITE A PRIMEIRTA NOTA:");
                    Nota1 = scanner.nextFloat();
                    System.out.println("DIGITE SEU PESO:");
                    Peso1 = scanner.nextFloat();
                    System.out.println("DIGITE A SEGUNDA NOTA:");
                    Nota2 = scanner.nextFloat();
                    System.out.println("DIGITE SEU PESO:");
                    Peso2 = scanner.nextFloat();
                    System.out.println("DIGITE A TERCEIRA NOTA:");
                    Nota3 = scanner.nextFloat();
                    System.out.println("DIGITE SEU PESO:");
                    Peso3 = scanner.nextFloat();

                    float PesoTotal = Peso1 + Peso2 + Peso3;

                    Media = ((Nota1 * Peso1) + (Nota2 * Peso2) + (Nota3 * Peso3)) / PesoTotal;

                    System.out.println("A MEDIA EH: " + Media);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true);
    }
}