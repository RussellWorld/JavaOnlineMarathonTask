package Day14;

public class Task44 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = 1;
        while (x / temp >= 10) {
            temp *= 10;
        }

        while (x > 0) {
            if (x / temp != x % 10) {
                return false;
            }

            x = (x % temp) / 10;
            temp /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221)); //true
        System.out.println(isPalindrome(121)); //true
        System.out.println(isPalindrome(10501)); //true
        System.out.println(isPalindrome(11)); //true
        System.out.println(isPalindrome(-121)); //false
        System.out.println(isPalindrome(12)); //false
    }
}
