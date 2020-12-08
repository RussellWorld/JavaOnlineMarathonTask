package Day6;

import java.util.Random;

public class Task22 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Иванович", "География");
        Student petya = new Student("Петя Петров");

        teacher.evaluate(petya);
    }

    public static class Student {
        private String fio;

        public Student(String fio) {
            this.fio = fio;
        }

        public String getFio() {
            return fio;
        }

        public void setFio(String fio) {
            this.fio = fio;
        }
    }

    public static class Teacher {
        private String fio;
        private String subject;

        public Teacher(String fio, String subject) {
            this.fio = fio;
            this.subject = subject;
        }

        public String getFio() {
            return fio;
        }

        public void setFio(String fio) {
            this.fio = fio;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void evaluate(Student student) {
            Random random = new Random();
            int randomValie = random.nextInt(4) + 2;
            String evaluation = "";
            switch (randomValie) {
                case 2:
                    evaluation = "неудовлетворительно";
                    break;
                case 3:
                    evaluation = "удовлетворительно";
                    break;
                case 4:
                    evaluation = "хорошо";
                    break;
                case 5:
                    evaluation = "отлично";
                    break;
            }
            System.out.println("Преподаватель " + this.fio + " оценил студента "
                    + student.getFio() + " по предмету " + this.subject
                    + " на оценку \n" + evaluation);
        }
    }
}