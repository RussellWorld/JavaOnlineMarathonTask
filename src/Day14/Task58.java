package Day14;

import java.util.*;

public class Task58 {

    public static void main(String[] args) {
        List<Shape> originList = new ArrayList<>();

        originList.add(new Circle("Circle", 2.0));
        originList.add(new Rectangle("Rectangle", 2.0, 3.0));
        originList.add(new Circle("Circle", 1.0));
        originList.add(new Rectangle("Rectangle", 3.0, 2.0));
        originList.add(new Circle("Circle", 0.5));
        originList.add(new Rectangle("Rectangle", 1.0, 2.0));

        List<Shape> actual = new MyUtils().maxAreas(originList);
        for (Shape shape : actual) {
            if (shape instanceof Circle) {
                System.out.println(shape.getName() + " " + ((Circle) shape).getRadius());
            } else {
                System.out.println(shape.getName() + " " + ((Rectangle) shape).getHeight() + " " + ((Rectangle) shape).getWidth());
            }
        }
    }

    abstract static class Shape {
        private final String name;

        public Shape(String name) {
            this.name = name;
        }

        public abstract double getArea();

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Shape)) return false;
            Shape shape = (Shape) o;
            return Objects.equals(getName(), shape.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName());
        }
    }

    static class Circle extends Shape {
        private final double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Circle)) return false;
            if (!super.equals(o)) return false;
            Circle circle = (Circle) o;
            return Double.compare(circle.getRadius(), getRadius()) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getRadius());
        }
    }

    static class Rectangle extends Shape {
        private final double height;
        private final double width;

        public Rectangle(String name, double height, double width) {
            super(name);
            this.height = height;
            this.width = width;
        }

        public double getArea() {
            return height * width;
        }

        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Rectangle)) return false;
            if (!super.equals(o)) return false;
            Rectangle rectangle = (Rectangle) o;
            return Double.compare(rectangle.getHeight(), getHeight()) == 0 &&
                    Double.compare(rectangle.getWidth(), getWidth()) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getHeight(), getWidth());
        }
    }

    public static class MyUtils {
        public List<Shape> maxAreas(List<Shape> shapes) {
            double maxCircle = 0;
            double maxRectangle = 0;

            for (Shape shape : shapes) {
                if (shape instanceof Circle) {
                    if (shape.getArea() > maxCircle) {
                        maxCircle = shape.getArea();
                    }
                } else {
                    if (shape.getArea() > maxRectangle) {
                        maxRectangle = shape.getArea();
                    }
                }
            }

            List<Shape> results = new ArrayList<>();
            for (Shape shape : shapes) {
                if (!results.contains(shape)) {
                    if (shape instanceof Circle) {
                        if (shape.getArea() == maxCircle) {
                            results.add(shape);
                        }
                    } else {
                        if (shape.getArea() == maxRectangle) {
                            results.add(shape);
                        }
                    }
                }
            }

            return results;
        }
    }
}
