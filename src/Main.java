import java.util.Scanner;
//калькулятор работает
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean isValidOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    isValidOperation = false;
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция!");
                isValidOperation = false;
                break;
        }

        if (isValidOperation) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}