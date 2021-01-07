package Day17;

public class Task77 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 250, 11000, -50, -2512, 1251, 34543, 242, 91};

        System.out.println(sum(numbers, 0));
    }

    public static int sum(int[] numbers, int i) {
        if (i == numbers.length)
            return 0;

        return numbers[i] + sum(numbers, i + 1);
    }
}
