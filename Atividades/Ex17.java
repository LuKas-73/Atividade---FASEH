import java.util.Scanner;

public class Ex17 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE SUA ALTURA:");
        double Altura = scanner.nextDouble();
        System.out.println("DIGITE SEU PESO:");
        double Peso = scanner.nextDouble();

        double IMC = Peso / (Altura * Altura);

        System.out.println("DIGITE SUA IDADE:");

        int Idade = scanner.nextInt();
        if (Idade < 65) {
            if (IMC < 18.5) {
                System.out.println("Baixo peso");
            } else if (IMC < 24.9) {
                System.out.println("Normal peso");
            } else if (IMC < 29.9) {
                System.out.println("Excesso de peso");
            } else if (IMC < 34.9) {
                System.out.println("Obesidade Classe 1");
            } else if (IMC < 39.9) {
                System.out.println("Obesidade Classe 2");
            } else {
                System.out.println("Obesidade Classe 3");
            }
        } else {
            if (IMC <= 22) {
                System.out.println("Baixo Peso");
            } else if (IMC < 27) {
                System.out.println("Normal Peso");
            } else {
                System.out.println("Sobrepeso");
            }
        }
    }
}