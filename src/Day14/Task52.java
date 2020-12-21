package Day14;

import Day13.User;

import java.util.Calendar;

public class Task52 {
    protected String name;
    protected String surname;

    public String getFullName() {
        return name + " " + surname;
    }

    public void User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    class Student extends User {
        protected int year;

        public int getCourseNumber() {
            int course = Calendar.getInstance().get(Calendar.YEAR) - year + 1;
            return (course > 0 && course < 7) ? course : -1;
        }

        public Student(int year, String name, String surname) {
            super(name);
            this.year = year;
        }
    }
}
