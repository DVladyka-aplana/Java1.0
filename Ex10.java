package appline.java.one;
import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
//1.Пользователь вводит размер массива и данные с клавиатуры в массив типа double
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество строк матрицы (целое число): ");
        int x = in.nextInt();
        System.out.println("Введите колличество столбцов матрицы (целое число): ");
        int y = in.nextInt();
        if (x<=0 || y<=0) {
            System.out.println("Недопустимый размер массива!");
        }
        else {
            double[][] myArray = new double[x][y];
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[0].length; j++) {
                    System.out.println("Введите значение для " + (j + 1) + "-ого элемента " + (i + 1) + "-ой строки матрицы: ");
                    double elem = in.nextDouble();
                    myArray[i][j] = elem;
                }
            }
            System.out.println("Матрица: ");
            System.out.println(Arrays.deepToString(myArray));
            //.Вывод первой строки матрицы *3
            System.out.println("Первая строка матрицы x3: ");
            for (int j = 0; j < myArray[0].length; j++) {
                double elem2 = myArray[0][j] * 3;
                System.out.print(elem2 + "; ");
            }
        }
    }
}
