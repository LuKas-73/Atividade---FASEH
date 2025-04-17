import java.util.Scanner;

public class Ex21 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("CONDIÇÃO DE EXISTÊNICA DE UM TRIÂNGULO \n");
        System.out.print("DIGITE O VALOR DO LADO A:");
        float A = scanner.nextFloat();
        System.out.print("DIGITE O VALOR DO LADO B:");
        float B = scanner.nextFloat();
        System.out.print("DIGITE O VALOR DO LADO C:");
        float C = scanner.nextFloat();

        if (((A + B) > C) && ((C + B) > A) && ((A + C) > B)){
            System.out.print("OS VALORES " + A + " , " + B + " e " + C + "\n");
            System.out.print("REPRESENTAM OS LADOS DE UM TRIÂNGULO");
        } else{
            System.out.print("TRIÂNGULO INEXISTENTE ! OS VALORES " + A + " , " + B + " e " + C + "\n");
            System.out.print("NÃO REPRESENTAM OS LADOS DE UM TRIÂNGULO");
        }
    }
}