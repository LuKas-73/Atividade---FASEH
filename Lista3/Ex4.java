package Lista3;

public class Ex4 {
    public static void executar() {
        float SomaTermosPares = 0;
        float SomaTermosImpares = 0;
        float SomaTermos = 0;

        for (int i = 0; i <= 50; i++) {
            if ((i + 1) % 2 == 0) {
                SomaTermosPares = SomaTermosPares + (1000 - (i * 3) / (i + 1));
            } else {
                SomaTermosImpares = SomaTermosImpares + (1000 - (i * 3) / (i + 1));
            }
        }

        SomaTermos = SomaTermosImpares - SomaTermosPares;
        System.out.println(SomaTermos);
    }
}