package appline.java.one;
import java.util.Scanner;

public class FinalEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.Ввод кол-ва строк
        System.out.println("Введите количество строк: ");
        int ks = in.nextInt();
        //2.Ввод строк (заполнение массива)
        String[] myArray1 = new String[ks];
        int maxl = 0;
        String res = "";

        for (int i = 0; i < ks; i++) {
            System.out.println("Введите " + (i + 1) + "-ую строку: ");
            String x = in.next();
            //myArray1[i] = x;
            char result1;
            char result2;
            int l = x.length();
            int uni = x.length();
            for (int j=0;j<l;j++){
                result1 = x.charAt(j);
                for (int k=j+1;k<l;k++){
                    result2 = x.charAt(k);
                    if(result1==result2){
                        uni = uni-1;
                        break;
                    }
                }
            }
            if(uni>maxl){
                maxl = uni;
                res = x;
            }
        }
        System.out.println("Строка с наибольшим кол-ом уникальных символов: "+res);
        System.out.println("Кол-во уникальных символов: "+maxl);
    }
}