package Day4;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        for (int element : array) {
            if (element > max)
                max = element;
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = 10000;
        for (int element : array) {
            if (element < min)
                min = element;
        }
        System.out.println("Наименший элемент массива: " + min);

        int counter = 0;
        for (int element : array
        ) {
            if (element % 10 == 0)
                counter++;
        }
        System.out.println("Количество элементов заканчивается на 0: " + counter);

        int counter1 = 0;
        for (int element : array
        ) {
            if (element % 10 == 0)
                counter1 += element;
        }
        System.out.println("Сумма элементов заканчивающихся на 0: " + counter1);
    }
}









