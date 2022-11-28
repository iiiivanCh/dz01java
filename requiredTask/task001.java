import java.util.Scanner;

public class task001 {

    public static void main(String[] args) {
        int userNamber = numberUser();
        System.out.println(factorialFun(userNamber));
        System.out.println(nthTriangularNumber(userNamber));
    }

    public static int numberUser() {
        while (true) {
            try {
                System.out.print("Введите натуральное число: ");
                Scanner iScanner = new Scanner(System.in);
                int num = iScanner.nextInt();
                iScanner.close();
                return num;
            } catch (Exception ex) {
                System.out.println("Ошибка ввода.");
            }
        }
    }

    public static double factorialFun(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++)
            result *= i;
        return result;
    }

    public static int nthTriangularNumber(int number) {
        int result = number * (number + 1) / 2;
        return result;
    }
}
