package Day5;

public class Task18 {
    public static void main(String[] args) {
        Automobile car = new Automobile();
        car.setColor("red");
        car.setYear(2000);
        car.setModel("audi");
        System.out.println("Our car: " + car.getYear() + " - year " +
                car.getModel() + " - Model " + car.getColor() + " - color ");

    }

    public static class Automobile {
        private int year = 0;
        private String color = null;
        private String model = null;

        public Automobile() {

        }

        public Automobile(int year, String color, String model) {
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getColor() {
            return color;
        }


        public void setColor(String color) {
            this.color = color;
        }


        public String getModel() {
            return model;


        }

        public void setModel(String model) {
            this.model = model;
        }
    }
}
