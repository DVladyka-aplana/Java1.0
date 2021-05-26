package appline.java.one;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

//Константы

        int con1 = 1;
        double con2 = 111.111;
        int con3 = -100;

//1.Пользователь вводит размер массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (целое число): ");
        int x = in.nextInt();
        if (x<=0) {
            System.out.println("Недопустимый размер массива!");
        }
        else {
            double[] myArray = new double[x];
//2.Пользователь вводит данные с клавиатуры в массив
            System.out.println("Ввод данных");
            for (int i = 0; i < myArray.length; i++) {
                System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
                double elem = in.nextDouble();
                if (elem == con1 || elem == con2 || elem == con3) {
                    System.out.println("Значение " + elem + " имеется в константах");
                }
                myArray[i] = elem;
            }
        }
    }
}
