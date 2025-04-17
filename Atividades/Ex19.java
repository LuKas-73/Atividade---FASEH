import java.util.Scanner;

public class Ex19 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        long Fatorial = 1;
        System.out.println("DIGITE O VALOR PARA SABER SEU FATORIAL");
        int Numero = scanner.nextInt();

        for (int i = 1; i <= Numero; i++) {
            Fatorial = Fatorial * i;
        }

        System.out.println(Fatorial);
    }
}