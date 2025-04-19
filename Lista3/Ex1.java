package Lista3;

import java.util.Scanner;

public class Ex1 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int Quantidade = 0;
        int NumeroCanal = 1;
        int PessoasAssistindo;
        int Quatro = 0, Cinco = 0, Sete = 0, Doze = 0;
        int PQuatro = 0, PCinco = 0, PSete = 0, PDoze = 0;

        while (true) {
            while (true) {
                System.out.println("DIGITE O CANAL QUE A CASA VIU:");
                System.out.print("(Entre canais 4,5,7,12. Para encerrar digite 0)");
                NumeroCanal = scanner.nextInt();

                if (NumeroCanal == 4 || NumeroCanal == 5 || NumeroCanal == 7 || NumeroCanal == 12 || NumeroCanal == 0) {
                    break;
                } else {
                    System.out.println("Este Canal não existe \n");
                }
            }

            if (NumeroCanal == 0) {
                break;
            }

            System.err.println("QUANTAS PESSOAS ESTAVAM ASSISTINDO?");
            PessoasAssistindo = scanner.nextInt();

            if (NumeroCanal == 4) {
                Quatro = Quatro + 1;
                PQuatro = PQuatro + PessoasAssistindo;
                NumeroCanal = 1;
            }

            if (NumeroCanal == 5) {
                Cinco = Cinco + 1;
                PCinco = PCinco + PessoasAssistindo;
                NumeroCanal = 1;
            }

            if (NumeroCanal == 7) {
                Sete = Sete + 1;
                PSete = PSete + PessoasAssistindo;
                NumeroCanal = 1;
            }

            if (NumeroCanal == 12) {
                Doze = Doze + 1;
                PDoze = PDoze + PessoasAssistindo;
                NumeroCanal = 1;
            }
        }

        int TotalPessoas = PCinco + PDoze + PQuatro + PSete;
        float PercentualQuatro = (PQuatro / TotalPessoas) * 100;
        float PercentualCinco = (PCinco / TotalPessoas) * 100;
        float PercentualDoze = (PDoze / TotalPessoas) * 100;
        float PercentualSete = (PSete / TotalPessoas) * 100;

        System.out.println("\n===== TABELA =====");
        System.out.printf("%-10s %-10s %-10s%n", "Canal", "Quantidade", "Percentual");
        System.out.printf("%-10s %-10d %-10.2f%n", "4", PQuatro, PercentualQuatro);
        System.out.printf("%-10s %-10d %-10.2f%n", "5", PCinco, PercentualCinco);
        System.out.printf("%-10s %-10d %-10.2f%n", "7", PSete, PercentualSete);
        System.out.printf("%-10s %-10d %-10.2f%n", "12", PDoze, PercentualDoze);

        System.out.println("\n\n Total = " + TotalPessoas);

    }
}