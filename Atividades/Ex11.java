import java.util.Scanner;

public class Ex11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int soma = 0;
        int valores = 0;
        
        do {
            System.out.print("DIGITE UM VALOR (0 para encerrar) \n");
            valores = scanner.nextInt();

            if ((valores != 0) && (valores % 2 == 0)) {
                soma = soma + valores;
                quantidade = quantidade + 1;
                break;
            }

        } while (valores != 0);

        if(quantidade > 0){
            double media = ((soma * 1.00)/(quantidade * 1.00));
            System.out.print("A MÉDIA É " + media);
        }else{
            System.out.print("ÃO TEVE NUMEROS PARES DIGITADOS");
        }
    }
}