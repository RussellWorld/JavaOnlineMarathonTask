package Day14;

public class Task54 {
    static class Person {
        public String surname;
        int age;
        String healthInfo;
        String name;

        public String getHealthStatus() {
            return (name + " " + healthInfo);
        }

        public Person(int age, String healthInfo, String name) {
            this.age = age;
            this.healthInfo = healthInfo;
            this.name = name;
        }
    }

    static class Child extends Person {
        private final String childIDNumber;

        public Child(int age, String healthInfo, String name, String childIDNumber) {
            super(age, healthInfo, name);
            this.childIDNumber = childIDNumber;
        }
    }

    static class Adult extends Person {
        private final String passportNumber;

        public Adult(int age, String healthInfo, String name, String passportNumber) {
            super(age, healthInfo, name);
            this.passportNumber = passportNumber;
        }
    }
}
