package Day8;

public class Task26 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(2010, "Boeing", 30, 40000);
        System.out.println(airplane);
    }

    static class Airplane {
        private int year;
        private String producer;
        private int lenght;
        private int weight;
        private int fuel;

        public Airplane(int year, String producer, int lenght, int weight) {
            this.year = year;
            this.producer = producer;
            this.lenght = lenght;
            this.weight = weight;
            this.fuel = 0;
        }

        public void inf() {
            System.out.println("Изготовитель: " + producer + " Год выпуска: " + year + " Длина " + lenght +
                    " Вес " + weight + " Обьем топлива в баке: " + fuel);
        }

        @Override
        public String toString() {
            return "Изготовитель: " + producer + " Год выпуска: " + year + " Длина " + lenght +
                    " Вес " + weight + " Обьем топлива в баке: " + fuel;
        }
    }
}
