import java.util.Scanner;

public class Ex2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DA LETRA A:");
        int A = scanner.nextInt();
        System.out.print("DIGITE O VALOR DA LETRA B:");
        int B = scanner.nextInt();
        System.out.print("DIGITE O VALOR DA LETRA C:");
        int C = scanner.nextInt();

        int Soma = A + B;

        if (Soma < C){
            System.out.print("A + B < C");
        } else{
            System.out.print("A + B >= C");
        }
    }
}