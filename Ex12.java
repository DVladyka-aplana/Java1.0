package appline.java.one;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите: I like Java!!!");
        String x = in.nextLine();
        boolean result = x.contains("Java");
        System.out.println("Строка содержит в себе слово Java: " + result);

        boolean result2 = x.startsWith("I Like");
        System.out.println("Строка начинается с I Like: " + result2);

        boolean result3 = x.endsWith("!!!");
        System.out.println("Строка заканчивается на !!!: " + result3);

        if (result&result2&result3) {
            String result4 = x.toUpperCase();
            System.out.println("Все условия выполнены! : " + result4);
        }

        String result5 = x.replace("a","o");
        String result6 = result5.substring(7,11);
        System.out.println(result6);

    }
}
