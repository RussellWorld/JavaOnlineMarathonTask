package Day5;

public class Task19 {
    public static void main(String[] args) {
        Moto moto = new Moto(2005, "red", "Yamaha");
        System.out.println("Our car: " + moto.getYear() + " - year " +
                moto.getModel() + " - Model " + moto.getColor() + " - color ");

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
    }
}