package Day9;

public class Task29 {
    public static void main(String[] args) {
        Student student = new Student("Bob", "3");
        Teacher teacher = new Teacher("Patrik", "Algebra");

        System.out.println(student.getGruppName());
        System.out.println(teacher.getPredmet());

        student.printInfo();
        teacher.printInfo();

    }

    public static class Human {

        protected String name;


        public Human(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void printInfo() {
            System.out.println("Этот человек с именем " + name);
        }
    }

    public static class Student extends Human {
        private String gruppName;

        public Student(String name, String gruppName) {
            super(name);
            this.gruppName = gruppName;
        }

        public String getGruppName() {
            return gruppName;
        }

        public void setGruppName(String gruppName) {
            this.gruppName = gruppName;
        }

        public void printInfo() {
            super.printInfo();
            System.out.println("Этот студент с именем " + name);
        }
    }

    public static class Teacher extends Human {
        private String predmet;

        public Teacher(String name, String predmet) {
            super(name);
            this.predmet = predmet;
        }

        public String getPredmet() {
            return predmet;
        }

        public void setPredmet(String predmet) {
            this.predmet = predmet;
        }

        public void printInfo() {
            super.printInfo();
            System.out.println("Этот преподаватель с именем " + name);

        }
    }
}
