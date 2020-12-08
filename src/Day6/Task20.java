package Day6;


public class Task20 {
    public static void main(String[] args) {
        Moto moto = new Moto(2005, "red", "Yamaha");
        moto.info();
        System.out.println(moto.yearDifference(2020));

//        System.out.println("Our car: " + moto.getYear() + " - year " +
//                moto.getModel() + " - Model " + moto.getColor() + " - color ");

        Car car = new Car();
        car.setColor("red");
        car.setYear(2001);
        car.setModel("audi");
        car.info();
        System.out.println(car.yearDifference(2020));
//        System.out.println("Our car: " + car.getYear() + " - year " +
//                car.getModel() + " - Model " + car.getColor() + " - color ");

    }

    static class Moto {
        private final int year;
        private final String color;
        private final String model;


        public Moto(int year, String color, String model) {
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }

        public void info() {
            System.out.println("Это мотоцикл! ");
        }

        public int yearDifference(int inputYear) {
            return Math.abs(inputYear - year);
        }
    }

    static class Car {
        private int year;
        private String color;
        private String model;

        public Car(int year, String color, String model) {
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public Car() {

        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }

        public void setColor(String color) {
        }

        public void setYear(int year) {
        }

        public void setModel(String model) {
        }

        public void info() {
            System.out.println("Это машина! ");
        }

        public int yearDifference(int inputYear) {
            return inputYear - year;
        }
    }
}

