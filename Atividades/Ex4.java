import java.util.Scanner;

public class Ex4 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        char Sexo;
        char Civil;

        System.out.print("DIGITE O NOME DO USUÁRIO \n");
        String Nome = scanner.next();
        
        while (true) {
            System.out.print("DIGITE O SEXO DO USUÁRIO \n");
            System.out.print("F para feminino, M para masculino:");
            Sexo = scanner.next().charAt(0);
            
            if (Sexo == 'M' || Sexo == 'F' || Sexo == 'm' || Sexo == 'f') {
                break;
            } else {
                System.out.println("Digitou errado, tente de novo \n");
            }
        }

        while (true) {
            System.out.print("DIGITE O ESTADO CIVIL \n");
            System.out.print("C para casado(a), S para solteiro(a):");
            Civil = scanner.next().charAt(0);
            
            if (Civil == 'C' || Civil == 'S' || Civil == 'c' || Civil == 's') {
                break;
            } else {
                System.out.println("Digitou errado, tente de novo \n");
            }
        }
        
        if ((Sexo == 'F' || Sexo == 'f') && (Civil == 'C' || Civil == 'c')){    
            System.out.print("Quantos anos casada milade?");
            int Anos = scanner.nextInt();
        }
    }
}