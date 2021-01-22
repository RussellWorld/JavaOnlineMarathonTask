package Day20;

public class Task90 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int count) {
        if (count + 1 == numbers.length)
            return numbers[count];
        return numbers[count] + recursionSum(numbers, count + 1);
    }
}
