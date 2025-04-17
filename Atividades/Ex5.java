import java.util.Scanner;

public class Ex5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O VALOR: ");
        int Num = scanner.nextInt();

        if (Num % 2 == 0){
            System.out.print("O NUMERO" + Num + "É PAR \n");
            if(Num % 3 == 0){
                System.out.print("E DIVISÍVEL POR 3");
            }else{ 
                System.out.print("E NÃO É DIVISÍVEL POR 3");
            }
        } else{
            System.out.print("O NUMERO É IMPAR \n");
            if(Num % 5 == 0){
                System.out.print("E DIVISÍVEL POR 5");
            }else{ 
                System.out.print("E NÃO É DIVISÍVEL POR 5");
            }
        }
    }
}