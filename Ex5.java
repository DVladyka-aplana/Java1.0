package appline.java.one;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //1.Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Действие: ");
        char z = in.next().charAt(0);
        System.out.println("Введите число y: ");
        double y = in.nextDouble();

        //2.В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции
        double result;
        switch (z) {
            case '+':
                result = x + y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            case '-':
                result = x - y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            case '*':
                result = x * y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            case '/':
                result = x / y;
                System.out.println("Результат: " + x + z + y + " = " + result);
                break;
            default:
                System.out.println("Ошибка при вводе действия");
        }
    }
}
