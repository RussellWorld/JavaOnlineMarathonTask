package Day3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое и делитель");

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0)
                break;
            if (a != 0) System.out.println("Результат деления " + a / b);

        }
    }
}
