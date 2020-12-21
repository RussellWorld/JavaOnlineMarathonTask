package Day14;

public class Task45 {
    public static int reverse(int x) {
        int temp = 0;
        int sign = (x < 0) ? (-1) : 1; //saving the sign (for negative numbers)
        x *= sign; //to deal with positiv numbers only
        while (x >= 1) {
            if (temp > Integer.MAX_VALUE / 10 || temp < Integer.MIN_VALUE / 10) {
                return 0;
            }
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        return temp * sign; //returning with the correct sign
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));

        System.out.println(reverse(150));
        System.out.println(reverse(-150));

        System.out.println(reverse(105));
        System.out.println(reverse(-105));

        System.out.println(reverse(0));
    }
}
