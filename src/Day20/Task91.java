package Day20;

public class Task91 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number) {
        int result = number % 10 == 0 ? 0 : number % 10 % 7 == 0 ? 1 : 0;
        if (number < 10)
            return result;
        return result + count7(number / 10);
    }
}
