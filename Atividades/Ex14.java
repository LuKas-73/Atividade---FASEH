import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe a altura do triângulo (1 a 20):");
            int Num = scanner.nextInt();

            if ((1 <= Num) && (Num <= 20)) {
                for (int i = 1; i <= Num; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Erro");
            }
        }
    }
}