package Day7;

public class Task23 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(2010, "Boeing", 30, 40000);
        Airplane airplane2 = new Airplane(2000, "Boeing", 40, 50000);
        Airplane.compareAirplanes(airplane, airplane2);
    }

    static class Airplane {
        private int year;
        private int lenght;
        private int weight;
        private int fuel;

        public Airplane(int year, String producer, int lenght, int weight) {
            this.year = year;
            this.lenght = lenght;
            this.weight = weight;
            this.fuel = 0;
        }


        public void setYear(int year) {
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

        public static void compareAirplanes(Airplane airplane, Airplane airplane2) {
            if (airplane.getLenght() > airplane2.getLenght()) {
                System.out.println("Первый самолет длинее");
            } else if (airplane.getLenght() < airplane2.getLenght()) {
                System.out.println("Второй самолет длинее");
            } else {
                System.out.println("Они равны");
            }
        }
    }
}
