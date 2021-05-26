package appline.java.one;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//1.Пользователь вводит размер массива и данные с клавиатуры в массив типа double
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (целое число): ");
        int x = in.nextInt();
        if (x<=0) {
        System.out.println("Недопустимый размер массива!");
        }
        else {
            double[] myArray = new double[x];
            System.out.println("Ввод данных");
            for (int i = 0; i <myArray.length; i++) {
                System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
                double elem = in.nextDouble();
                myArray[i] = elem;
            }
 //2.Посчитайте среднее арифметическое элементов массива.
            double total = 0;
            for (int i = 0; i < myArray.length; i++) {
                total = total + myArray[i];
            }
            System.out.println("Среднее арифметическое элементов массива: " + total/myArray.length);
 //3.Вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i] * total / myArray.length);
            }
        }
    }
}
