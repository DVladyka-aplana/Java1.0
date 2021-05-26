package appline.java.one;
import java.util.Scanner;

public class FinalEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий курс долара: ");
        double x = in.nextDouble();
        if (x<0) {
            System.out.println("Курс не может быть отрицательным числом");
            System.exit(0);
        }


        System.out.println("Введите количество рублей: ");
        double y = in.nextDouble();
        if (y<0) {
            System.out.println("Сумма не может быть отрицательной");
            System.exit(0);
        }

        double z = y/x;
        System.out.printf("Итого: %.2f долларов", z);

    }
}
