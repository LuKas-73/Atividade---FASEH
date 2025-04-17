import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] N = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("DIGITE O VALOR DO NUMERO " + (i + 1) + ":\n");
            N[i] = scanner.nextInt();
        }
        
        System.out.print("NUMEROS NEGATIVOS: \n");
        for(int i = 0; i < 5; i++){
            if(N[i] < 0){
                System.out.print(N[i] + "\n");
            }
        }
    }
}