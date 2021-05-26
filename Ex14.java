package appline.java.one;
import java.util.Arrays;
import java.util.Random;

public class Ex14 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] myArray = new double[15];
        double maxNumber = -21;
        double minNumber = 21;

        for (int i=0; i < 15; i++) {
            double x = Math.random() * 40 - 20;
            myArray[i] = x;
            if(maxNumber <= myArray[i]) {
                maxNumber = myArray[i];
            }
            if(minNumber >= myArray[i]) {
                minNumber = myArray[i];
            }
        }
        System.out.println("Сформирован произвольный массив:");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Максимальный элемент массива: "+maxNumber);
        System.out.println("Минимальный элемент массива: "+minNumber);
        System.out.print("Наибольшее по модулю значение: ");

        double result = Math.abs(minNumber);
        double result2 = Math.abs(maxNumber);

        System.out.print(Math.max(result, result2));
    }
}
