import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE UM VALOR: ");
        int numero = scanner.nextInt();

        System.out.println("TABUADA DO " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
