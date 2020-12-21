package Day14;

public class Task53 {
    abstract static class Animal {
        int age;
        double weight;

        public abstract String move();

        public Animal(int age, double weight) {
            this.age = age;
            this.weight = weight;
        }

        public Animal() {
        }
    }

    static class Mammal extends Animal {
        final public String move() {
            return "run";
        }
    }

    static final class Fish extends Animal {
        public String move() {
            return "swim";
        }
    }

    static final class Bird extends Animal {
        public String move() {
            return "fly";
        }
    }
}
