package Day2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int c = scanner.nextInt();
        System.out.println("Введите второе число ");
        int d = scanner.nextInt();
        int i = c + 1;

        while (i < d) {
            i++;
            if (i % 5 == 0 && i % 10 != 0)
                System.out.print(i + " ");
        }
    }
}
