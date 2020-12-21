package Day14;

public class Task46 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }

        long dividendL = dividend;

        int sign1 = (dividendL < 0) ? -1 : 1;
        int sign2 = (divisor < 0) ? -1 : 1;

        if (sign1 < 0) {
            dividendL = -dividendL;
        }
        if (sign2 < 0) {
            divisor = -divisor;
        }

        long temp = 0;
        while (dividendL >= divisor) {
            dividendL -= divisor;
            temp++;
        }

        if ((sign1 < 0 && sign2 > 0) || (sign1 > 0 && sign2 < 0)) {
            temp = -temp;
        }

        return (int) temp;
    }
}
