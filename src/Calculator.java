import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char calcOper = 'c';
        double num1;
        double num2;
        char operation;
        double result = 0;
        do {
            if (calcOper == 'c') { // проверка переменной calcOper
                System.out.println("Введите первое число: ");
                num1 = scanner.nextInt();
                System.out.println("Выберите операцию: +, -, *, / ");
                operation = scanner.next().charAt(0);
            } else {
                num1 = result;
                operation = calcOper;
            }
            System.out.println("Введите второе число");
            num2 = scanner.nextInt();
            result = calc(num1, operation, num2);
            System.out.println("Результат вычисления "+num1 + " " + operation + " " + num2 + " = " + result);
            System.out.println("Нажмите 'c' для сброса, 's' для выхода (Латиницей!) " +
                    "\nили выберите операцию: +, -, *, / для продолжения");
            calcOper = scanner.next().charAt(0);
        } while (calcOper != 's');
    }
    public static double calc(double num1, char operation, double num2) {
        return switch (operation) {
            case '+' -> num1 + num2; //Операция сложения
            case '-' -> num1 - num2; //Операция вычитания
            case '*' -> num1 * num2; //Операция умножения
            case '/' -> num1 / num2; //Операция деления
            default -> {
                System.out.println("Введен некорректный оператор");
                yield 0;
            }
        };
    }
}