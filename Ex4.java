package appline.java.one;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        //1.Ввести три числа с клавиатуры x, y, z
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите число y: ");
        double y = in.nextDouble();
        System.out.println("Введите число z: ");
        double z = in.nextDouble();

        //2.Найти и вывести в консоль среднее арифметическое этих чисел
        double sr = (x + y + z)/3;
        System.out.println("Среднее арифметическое введенных чисел: " + sr);

        //3.Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        int result = (int)Math.floor(sr/2);

        //4.Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
