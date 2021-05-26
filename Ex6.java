package appline.java.one;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //1.Пользователю предлагается на выбор ввести массу или расстояние
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - расстояние, 2 - масса");
        int x = in.nextInt();

        //2.Пользователю предлагается выбрать единицу измерения
        if (x==1){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int a = in.nextInt();
            System.out.println("Введите число: ");
            double data = in.nextDouble();
            if (a==1){
                System.out.println("Результат: ");
                System.out.println("Метры: " + data);
                double ml = data * 0.00062136931818182;
                System.out.println("Мили: " + ml);
                double ya = data * 1.09361;
                System.out.println("Ярды: " + ya);
                double ft = data * 3.2808300000000092389;
                System.out.println("Футы: " + ft);
            }
            else if (a==2){
                System.out.println("Результат: ");
                System.out.println("Мили: " + data);
                double m = data * 1609.34;
                System.out.println("Метры: " + m);
                double ya = data * 1759.99562552;
                System.out.println("Ярды: " + ya);
                double ft = data * 5279.9868765599994731;
                System.out.println("Футы: " + ft);
            }
            else if (a==3){
                System.out.println("Результат: ");
                System.out.println("Ярды: " + data);
                double m = data * 0.9144;
                System.out.println("Метры: " + m);
                double ml = data * 0.000568182;
                System.out.println("Мили: " + ml);
                double ft = data * 3;
                System.out.println("Футы: " + ft);
            }
            else if (a==4){
                System.out.println("Реультат: ");
                System.out.println("Футы: " + data);
                double m = data * 0.3048;
                System.out.println("Метры: " + m);
                double ml = data * 0.000189394;
                System.out.println("Мили: " + ml);
                double ya = data * 0.33333344;
                System.out.println("Ярды: " + ya);
            }
            else {
                System.out.println("Ошибка: укажите допустимое значение");
            }

        }
        else if (x==2){
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - унция, 4 - фунт");
            int a = in.nextInt();
            System.out.println("Введите число: ");
            double data = in.nextDouble();
            if (a==1){
                System.out.println("Результат: ");
                System.out.println("Килограмм: " + data);
                double gr = data * 1000;
                System.out.println("Грамм: " + gr);
                double un = data * 35.2739999996032;
                System.out.println("Унций: " + un);
                double fn = data * 2.20462;
                System.out.println("Фунты: " + fn);
            }
            else if (a==2){
                System.out.println("Результат: ");
                System.out.println("Грамм: " + data);
                double kg = data * 0.001;
                System.out.println("Килограмм: " + kg);
                double un = data * 0.035274;
                System.out.println("Унций: " + un);
                double fn = data * 0.002204624999975199947;
                System.out.println("Фунты: " + fn);
            }
            else if (a==3){
                System.out.println("Результат: ");
                System.out.println("Унций: " + data);
                double kg = data * 0.0283495;
                System.out.println("Килограмм: " + kg);
                double gr = data * 28.34950000001049;
                System.out.println("Грамм: " + gr);
                double fn = data * 0.062499949018124993649;
                System.out.println("Фунты: " + fn);
            }
            else if (a==4){
                System.out.println("Реультат: ");
                System.out.println("Фунты: " + data);
                double kg = data * 0.453592;
                System.out.println("Килограмм: " + kg);
                double gr = data * 453.592;
                System.out.println("Грамм: " + gr);
                double un = data * 16;
                System.out.println("Унций: " + un);
            }
            else {
                System.out.println("Ошибка: укажите допустимое значение");
            }
        }
        else {
            System.out.println("Ошибка: укажите допустимое значение");
        }
    }
}