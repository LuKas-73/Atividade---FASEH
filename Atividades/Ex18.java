public class Ex18 {
    public static void executar() {
        for (int j = 2; j <= 100; j++) {
            boolean ehPrimo = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(j);
            }
        }
    }
}