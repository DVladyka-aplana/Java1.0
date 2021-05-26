package appline.java.one;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String x = in.nextLine();
        String[] myArray = x.split(" ");
        int j = 0;
        System.out.println(Arrays.deepToString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            String sl = myArray[i];
            boolean check = sl.matches("^[a-zA-Z]+$");
            if (check) {
                System.out.println(myArray[i]);
                j = j + 1;
            }
        }
        System.out.println("Кол-во слов, состоящих из латиницы: " + j);
    }
}
