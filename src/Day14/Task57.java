package Day14;

import java.util.List;

public class Task57 {
    public static void main(String[] args) {

    }

    static class Rectang {
        private final double a;
        private final double b;

        public Rectang(double a, double b) {
            this.a = a;
            this.b = b;
        }


        public double getPerimeter() {
            return 2 * (a + b);
        }
    }

    static class Square extends Rectang {
        public Square(double a) {
            super(a, a);
        }

        public double getPerimeter() {
            return super.getPerimeter();
        }
    }

    public static class MyUtils {
        public double sumPerimeter(List<Rectang> figures) {
            double sum = 0;
            for (Rectang rectang : figures) {
                if (rectang != null) {
                    sum += rectang.getPerimeter();
                }
            }
            return sum;
        }
    }
}
