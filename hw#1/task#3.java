package hw#3;


/**
 * task3
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task#3 {
    // метод получения числа
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
        // scan.close(); Почему не получается закрыть Scanner???
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static int getResult(String opr, int a, int b) {
        int result = 0;
        switch (opr) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int a = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int b = scanNumber();
        int result = getResult(operations, a, b);
        System.out.printf("%d %s %d = %d", a, operations, b, result);

    }

}
