package Lista3;

import java.util.Scanner;

public class Ex3 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int[] Idade = new int[10];
        float[] Peso = new float[10], Altura = new float[10];

        int TotalIdade = 0;
        int TotalNoventaBaixinho = 0, TotalJovensAltos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("DIGITE A IDADE DA PESSOA NÚMERO " + (i + 1) + ":");
            Idade[i] = scanner.nextInt();

            System.out.println("DIGITE O PESO DA PESSOA NÚMERO " + (i + 1) + ":");
            Peso[i] = scanner.nextFloat();

            System.out.println("DIGITE A ALTURA DA PESSOA NÚMERO " + (i + 1) + ":");
            Altura[i] = scanner.nextFloat();

            if ((Peso[i] > 90) && (Altura[i] < 1.50)) {
                TotalNoventaBaixinho = TotalNoventaBaixinho + 1;
            }

            if ((Idade[i] > 30) && (Idade[i] < 10) && (Altura[i] < 1.50)) {
                TotalJovensAltos = TotalJovensAltos + 1;
            }

            TotalIdade = TotalIdade + Idade[i];
        }

        float MediaIdade = TotalIdade / 10;
        float PercentualJovensAltos = ((TotalJovensAltos / 10) * 100);

        System.out.println("\nMedia: " + MediaIdade);
        System.out
                .println("\nTotal que possui superior a 90 kg e altura inferior a 1,50 metro: " + TotalNoventaBaixinho);
        System.err.println(
                "\nPorcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de 1,90 m: "
                        + PercentualJovensAltos);

        System.out.println("\n\n===== TABELA =====");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Pessoa", "Idade", "Altura", "Peso");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", (i + 1), Idade[i], Altura[i], Peso[i]);
        }
    }
}