
public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Все простые числа от 1 до 1000: ");
        int total = 0;
        for (int i = 1; i <= 1000; i++){
            boolean marker = true;
            if (i == 1) continue;
            for (int j = 2; j < (i / 2) + 1; j++ ){
                int result = i % j;
                if (result == 0) {
                    marker = false;
                    break;
                }
            }
            if (marker) {
                System.out.print(i + " ");
                total++;
            }
        }
        System.out.println();
        System.out.println(total);
    }
}
