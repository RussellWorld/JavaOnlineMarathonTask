package Day2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите этаж дома ");
        int floor = scanner.nextInt();
        if (floor >= 0 && floor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floor >= 9 && floor <= 200) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Землянка или еще не построили, введите другой этаж");
        }
    }
}
