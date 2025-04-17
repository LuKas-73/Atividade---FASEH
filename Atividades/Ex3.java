import java.util.Scanner;

public class Ex3 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O VALOR: ");
        int Num = scanner.nextInt();
        int Quadrado = Num * Num;
        int Cubo = Num * Num * Num;

        if (Num % 2 == 0){
            System.out.print("O NUMERO É PAR \n");
            System.out.print(Num + "² = " + Quadrado);
        } else{
            System.out.print("O NUMERO É IMPAR \n");
            System.out.print(Num + "³ = " + Cubo);
        }
    }
}