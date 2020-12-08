package Day6;


public class Task21 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(2010, "Boeing", 30, 40000);

        airplane.setYear(2011);
        airplane.setLenght(35);
        airplane.fillUp(400);
        airplane.fillUp(900);
        airplane.inf();

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

        public void fillUp(int inputFuel) {
            fuel += inputFuel;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        public int getLenght() {
            return lenght;
        }

        public void setLenght(int lenght) {
            this.lenght = lenght;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }
}
