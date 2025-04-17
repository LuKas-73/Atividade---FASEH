public class Ex12 {
    public static void executar() {
        for(int i = 0; i <= 100; i++){
            if(i != 100 && (i % 2 == 0)){
                System.out.print(i + ",");
            } else if(i == 100){
                System.out.print(i);
            }
        }
    }
}