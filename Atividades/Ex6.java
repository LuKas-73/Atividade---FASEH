import java.util.Scanner;

public class Ex6 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("QUAL TURNO O USUARIO ESTUDA? \n");
        System.out.print("N para noturno, V para vespertino e M para matutino:");
        char Turno = scanner.next().charAt(0);

        if (Turno == 'M' || Turno == 'm'){
            System.out.print("BOM DIA!");
        } else if (Turno == 'V' || Turno == 'v'){
            System.out.print("BOA TARDE!");
        } else if(Turno == 'N' || Turno == 'n'){
            System.out.print("BOA NOITE!");
        } else{
            System.out.print("BOM ALGUMA COISA PARA TI (sei lá)");
        }
    }
}