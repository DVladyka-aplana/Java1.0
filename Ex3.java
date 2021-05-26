package appline.java.one;

public class Ex3 {
    public static void main(String[] args) {
//1.Задайте массив из 5 любых целых чисел
        int[] myArray = new int[] {13,8,23,24,32};

//2.Поменяйте местами первый и последний элемент в массиве
        int first = myArray[0];
        int last = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = first;
        myArray[0] = last;
        System.out.println("Старое значение первого элемента: " + first + " ; Новое значение: " + myArray[0]);
        System.out.println("Старое значение последнего элемента: " + last + " ; Новое начение: " + myArray[myArray.length - 1]);

//3.Вывести в консоль результат суммы первого и среднего элемента
        System.out.println("Сумма первого и среднего элемента: " + (myArray[myArray.length/2] + myArray[0]));
    }
}
