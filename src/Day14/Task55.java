package Day14;

import java.util.*;

public class Task55 {
    public static void main(String[] args) {

    }

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName());
        }
    }

    static class Student extends Person {
        private final String studyPlace;
        private final int studyYears;

        public Student(String name, String studyPlace, int studyYears) {
            super(name);
            this.studyPlace = studyPlace;
            this.studyYears = studyYears;
        }

        public String getStudyPlace() {
            return studyPlace;
        }

        public int getStudyYears() {
            return studyYears;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return getName().equals(student.getName()) &&
                    getStudyYears() == student.getStudyYears() &&
                    getStudyPlace().equals(student.getStudyPlace());
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.getName(), getStudyPlace(), getStudyYears());
        }
    }

    static class Worker extends Person {
        private final String workPosition;
        private final int experienceYears;

        public Worker(String name, String workPosition, int experienceYears) {
            super(name);
            this.workPosition = workPosition;
            this.experienceYears = experienceYears;
        }

        public String getWorkPosition() {
            return workPosition;
        }

        public int getExperienceYears() {
            return experienceYears;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Worker)) return false;
            if (!super.equals(o)) return false;
            Worker worker = (Worker) o;
            return getName().equals(worker.getName()) &&
                    getExperienceYears() == worker.getExperienceYears() &&
                    Objects.equals(getWorkPosition(), worker.getWorkPosition());
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.getName(), getWorkPosition(), getExperienceYears());
        }
    }

    public static class MyUtils {
        public List<Person> maxDuration(List<Person> persons) {
            List<Worker> workers = new ArrayList<>();
            List<Student> students = new ArrayList<>();

            int max_exp = 0;
            int max_study = 0;

            for (Person person : persons) {
                if (person instanceof Worker && !workers.contains(person)) {
                    workers.add((Worker) person);
                    if (((Worker) person).getExperienceYears() > max_exp) {
                        max_exp = ((Worker) person).getExperienceYears();
                    }
                }

                if (person instanceof Student && !students.contains(person)) {
                    students.add((Student) person);
                    if (((Student) person).getStudyYears() > max_study) {
                        max_study = ((Student) person).getStudyYears();
                    }
                }
            }

            List<Person> result = new ArrayList<>();
            for (Worker worker : workers) {
                if (worker.getExperienceYears() == max_exp) {
                    result.add(worker);
                }
            }
            for (Student student : students) {
                if (student.getStudyYears() == max_study) {
                    result.add(student);
                }
            }

            return result;
        }
    }
}
