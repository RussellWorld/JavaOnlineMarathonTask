package Day3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое и делитель");
        for (int i = 0; i < 5; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println("Результат деления " + a / b);
        }
    }
}
