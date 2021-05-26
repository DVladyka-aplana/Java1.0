package appline.java.one;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //1.Пользователь вводит любое целое положительное число
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int x = in.nextInt();
        if (x<0) {
            System.out.println("Ошибка: введено отрицательное число!");
        }
        else {
            int total = 0;
            for (int i = 0; i <= x; i++) {
                if (!(i%2 == 0)) {
                    total += i;
                }
            }
            System.out.println("Сумма всех нечетных чисел: "+total);
        }
    }
}
