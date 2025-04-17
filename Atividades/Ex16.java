import java.util.Scanner;

public class Ex16 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        char Sexo;
        int SomaHomem = 0;
        int QuantidadeHomem = 0;
        int SomaMulher = 0;
        int QuantidadeMulher = 0;
        int idade;

        for (int i = 0; i < 20; i++) {

            while (true) {
                System.out.println("QUAL O SEXO? \n");
                System.out.println("F para feminino, M para Masculino");
                Sexo = scanner.next().charAt(0);

                if (Sexo == 'M' || Sexo == 'F' || Sexo == 'm' || Sexo == 'f') {
                    break;
                } else {
                    System.out.println("Digitou errado, tente de novo \n");
                }
            }

            System.out.println("QUAL A IDADE?");
            idade = scanner.nextInt();

            if (Sexo == 'M' || Sexo == 'm') {
                QuantidadeHomem = QuantidadeHomem + 1;
                SomaHomem = SomaHomem + idade;
            }

            if (Sexo == 'F' || Sexo == 'f') {
                QuantidadeMulher = QuantidadeMulher + 1;
                SomaMulher = SomaMulher + idade;
            }
        }

        double mediaMasculino = (QuantidadeHomem > 0) ? (double) SomaHomem / QuantidadeHomem : 0;
        double mediaFeminino = (QuantidadeMulher > 0) ? (double) SomaMulher / QuantidadeMulher : 0;

        System.out.println("\n===== TABELA =====");
        System.out.printf("%-10s %-10s %-10s%n", "Sexo", "Quantidade", "Média");
        System.out.printf("%-10s %-10d %-10.2f%n", "M", QuantidadeHomem, mediaMasculino);
        System.out.printf("%-10s %-10d %-10.2f%n", "F", QuantidadeMulher, mediaFeminino);
    }
}