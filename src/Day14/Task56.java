package Day14;

import java.math.BigDecimal;
import java.util.*;


public class Task56 {
    public static void main(String[] args) {
        List<Employee> originList = new ArrayList<>();

        originList.add(new Employee("Ivan", 10, new BigDecimal("3000.00")));
        originList.add(new Manager("Petro", 9, new BigDecimal("3000.00"), 1.5));
        originList.add(new Employee("Stepan", 8, new BigDecimal("4000.00")));
        originList.add(new Employee("Andriy", 7, new BigDecimal("3500.00")));
        originList.add(new Employee("Ihor", 5, new BigDecimal("3500.00")));
        originList.add(new Manager("Vasyl", 8, new BigDecimal("2000.00"), 2.0));

        List<Employee> actual = new MyUtils().largestEmployees(originList);
        for (Employee emp : actual) {
            System.out.println(emp.getName() + " " + emp.getExperience() + " " + emp.getPayment());
        }
    }

    static class Employee {
        private final String name;
        private final int experience;
        private final BigDecimal basePayment;

        public Employee(String name, int experience, BigDecimal basePayment) {
            this.name = name;
            this.experience = experience;
            this.basePayment = basePayment;
        }

        public String getName() {
            return name;
        }

        public int getExperience() {
            return experience;
        }

        public BigDecimal getPayment() {
            return basePayment;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Employee)) return false;
            Employee employee = (Employee) o;
            return getExperience() == employee.getExperience() &&
                    Objects.equals(getName(), employee.getName()) &&
                    Objects.equals(basePayment, employee.basePayment);
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getExperience(), basePayment);
        }
    }

    static class Manager extends Employee {
        private final double coefficient;

        public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
            super(name, experience, basePayment);
            this.coefficient = coefficient;
        }

        public String getName() {
            return super.getName();
        }

        public int getExperience() {
            return super.getExperience();
        }

        public BigDecimal getPayment() {
            return new BigDecimal(coefficient).multiply(super.getPayment());
        }

        public double getCoefficient() {
            return coefficient;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Manager)) return false;
            if (!super.equals(o)) return false;
            Manager manager = (Manager) o;
            return getExperience() == manager.getExperience() &&
                    Objects.equals(getName(), manager.getName()) &&
                    Objects.equals(getPayment(), manager.getPayment()) &&
                    Double.compare(manager.coefficient, coefficient) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), coefficient);
        }
    }

    public static class MyUtils {
        public List<Employee> largestEmployees(List<Employee> workers) {
            List<Employee> employees = new ArrayList<>();
            List<Manager> managers = new ArrayList<>();

            int maxEmpExp = 0;
            BigDecimal maxEmpPay = new BigDecimal(0);

            int maxManExp = 0;
            BigDecimal maxManPay = new BigDecimal(0);

            for (Employee employee : workers) {
                if (employee instanceof Manager && !managers.contains(employee)) {
                    managers.add((Manager) employee);
                    if (employee.getExperience() > maxManExp) {
                        maxManExp = employee.getExperience();
                    }
                    if (employee.getPayment().compareTo(maxManPay) > 0) {
                        maxManPay = employee.getPayment();
                    }
                }

                if (employee != null && !(employee instanceof Manager) && !employees.contains(employee)) {
                    employees.add(employee);
                    if (employee.getExperience() > maxEmpExp) {
                        maxEmpExp = employee.getExperience();
                    }
                    if (employee.getPayment().compareTo(maxEmpPay) > 0) {
                        maxEmpPay = employee.getPayment();
                    }
                }
            }

            List<Employee> results = new ArrayList<>();
            for (Employee employee : workers) {
                if (employee instanceof Manager && !results.contains(employee)) {
                    if (employee.getExperience() == maxManExp || employee.getPayment().compareTo(maxManPay) == 0) {
                        results.add(employee);
                    }
                }

                if (employee != null && !(employee instanceof Manager) && !results.contains(employee)) {
                    if (employee.getExperience() == maxEmpExp || employee.getPayment().compareTo(maxEmpPay) == 0) {
                        results.add(employee);
                    }
                }
            }

            return results;
        }
    }
}
