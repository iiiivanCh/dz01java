import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double numberUser01 = getNumberUser();
        double numberUser02 = getNumberUser();
        String signUser = getSignUser();
        double totalUser = getSolution(numberUser01, numberUser02, signUser);
        System.out.print("Итого: ");
        System.out.println(totalUser);
    }

    public static double getNumberUser() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Введите число: ");
                Double num = Double.parseDouble(input.next());
                // input.close();
                return num;
            } catch (Exception ex) {
                System.out.println("Ошибка ввода");
            }
        }
    }

    public static String getSignUser() {
        String sign = "";
        while (true) {
            System.out.print("Введите знак математического действия: ");
            Scanner input = new Scanner(System.in);
            sign = input.nextLine();
            // iScanner.close();
            // if ((sign == "*") || (sign == "/") || (sign == "+") || (sign == "-")) {
            // if (sign == "*") {
            if (sign.contains("*") || sign.contains("/") || sign.contains("+") || sign.contains("-")) {
                return sign;
            } else {
                System.out.println("Ошибка ввода");
            }
        }
    }

    public static Double getSolution(Double number01, Double number02, String sign) {
        Double total = 0.0;
        switch (sign) {
            case "*":
                total = number01 * number02;
                break;
            case "/":
                total = number01 / number02;
                break;
            case "+":
                total = number01 + number02;
                break;
            case "-":
                total = number01 - number02;
                break;
        }
        return total;
    }
}
