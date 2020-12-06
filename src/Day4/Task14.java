package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");

        int x = scanner.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Длинна массива равна: " + array.length);

        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counter8++;
        }
        System.out.println("Количество чисел больше 8: " + counter8);


        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                counter8++;
        }
        System.out.println("Количество чисел равных 1: " + counter1);

        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println("Количество четных чисел: " + counterEven);

        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                counterOdd++;
        }
        System.out.println("Количество нечетных чисел: " + counterOdd);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                sum += array[i];
        }
        System.out.println("Сумме всех элементов массива = " + sum);

    }
}
