public class Ex20 {
    public static void executar() {
        long n1 = 0, n2 = 1;

        for (int i = 1; i <= 100; i++) {
            System.out.println(n1);
            long proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
}
