import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Для выхода наберите - s");
        char signUser = 'b';
        Scanner input = new Scanner(System.in);
        while (signUser != 's') {
            double numberUser01 = getNumberUser(input);
            double numberUser02 = getNumberUser(input);
            signUser = getSignUser(input);
            double totalUser = getSolution(numberUser01, numberUser02, signUser);
            System.out.print("Итого: ");
            System.out.println(totalUser);
        }
        input.close();
    }

    public static double getNumberUser(Scanner input) {
        System.out.print("Введите число: ");
        if (input.hasNextDouble()) {
            double num = input.nextDouble();
            return num;
        }
        else {
            System.out.println("Ошибка ввода. Не является числом!");
            return 0;
        }
    }

    public static char getSignUser(Scanner input) {
        System.out.print("Введите знак математического действия: ");
        if (input.hasNext()) {
            char sign = input.next().charAt(0);
        if (sign == '*' || sign == '/' || sign == '+' || sign == '-' || sign == 's') {
            return sign;
            } else {
                System.out.println("Ошибка ввода. Такой операции нет");
                return 'b';
            }
        }
        return 'b';
    }

    public static Double getSolution(Double number01, Double number02, char sign) {
        Double total = 0.0;
        switch (sign) {
            case '*':
                total = number01 * number02;
                break;
            case '/':
                total = number01 / number02;
                break;
            case '+':
                total = number01 + number02;
                break;
            case '-':
                total = number01 - number02;
                break;
        }
        return total;
    }
}
