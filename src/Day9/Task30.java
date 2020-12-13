package Day9;

public class Task30 {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 12, 5, 11),
                new Triangle("Blue", 12, 6, 7),
                new Rectangle("Red", 22, 15),
                new Circle(5, "Dark")
        };

        System.out.println(calculatePerimeter(figures));
        System.out.println(calculateArea(figures));
    }

    public static double calculatePerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure figure :
                figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();

        }
        return sum;
    }

    public static double calculateArea(Figure[] figures) {
        double sum = 0;

        for (Figure figure :
                figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();

        }
        return sum;
    }


    public abstract static class Figure {
        protected String color;

        public Figure(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public abstract double area();

        public abstract double perimeter();
    }

    public static class Circle extends Figure {
        private double r;

        public Circle(double r, String color) {
            super(color);
            this.r = r;
        }

        @Override
        public double area() {
            return r * r * Math.PI;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * r;
        }
    }

    public static class Rectangle extends Figure {
        private double width, height;

        public Rectangle(String color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }

        @Override
        public double perimeter() {
            return 2 * (width + height);
        }
    }

    public static class Triangle extends Figure {
        private double a, b, c;

        public Triangle(String color, double a, double b, double c) {
            super(color);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double area() {
            double halfP = perimeter() / 2;
            return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        }

        @Override
        public double perimeter() {
            return a + b + c;
        }
    }
}
