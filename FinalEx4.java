package appline.java.one;
import java.util.Scanner;

public class FinalEx4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(">Отгадайте загадку");
        int pod = 0;
        for (int i=1;i<=3;i++) {
            System.out.println(">\"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
            System.out.println(">Ответ: ");
            String x = in.nextLine();
            if (x.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println(">Правильно!");
                System.exit(0);
            }
            else if (x.equalsIgnoreCase("Подсказка")&i==1){
                System.out.println("Подсказка: Заархивированный вирус");
                pod = 1;
            }
            else if (x.equalsIgnoreCase("Подсказка")&2<=i){
                System.out.println("Подсказка больше не доступна!");
                i = i-1;
            }
            else {
                if(i<3) {
                    System.out.println("Подумай ещё!");
                }
                else if (pod==1){
                    System.out.println(">Обидно, приходи в другой раз");
                    System.exit(0);
                }
            }
        }
        System.out.println(">Обидно, приходи в другой раз!");
    }
}
