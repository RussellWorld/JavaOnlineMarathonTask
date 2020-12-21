package Day14;

public class Task47 {
    public static int mySqrt(int x) {
        long temp = 0;
        while (temp * temp <= x) {
            temp++;
        }
        return (int) (temp - 1);
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(121));
        System.out.println(mySqrt(100));
        System.out.println(mySqrt(2147395600));
    }
}
