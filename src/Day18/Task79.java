package Day18;

public class Task79 {
    public static void main(String[] args) {

    }

    static class Operation {
        public static int squareRectangle(int a, int b) throws IllegalArgumentException {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException();
            }
            return a * b;
        }

        public static int trySquareRectangle(int a, int b) {
            try {
                int area = squareRectangle(a, b);
                return area;
            } catch (IllegalArgumentException ex) {
                return 0;
            }
        }
    }
}
