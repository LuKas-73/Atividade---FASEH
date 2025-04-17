import java.util.Scanner;

public class Ex9 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE A QUANTIDADE DE NUMEROS IMPARES:");
        int NumImpares = scanner.nextInt();
        int[] ListaNum = new int[NumImpares];
        int valor = 1;
        
        for (int i = 0; i < NumImpares; i++) {
            ListaNum[i] = valor;
            valor += 2;
        }

        for (int j = NumImpares - 1; j >= 0; j--) {
            if (j != 0) {
                System.out.print(ListaNum[j] + ", ");
            } else {
                System.out.print(ListaNum[j]);
            }
        }
    }
}