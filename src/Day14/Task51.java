package Day14;

public class Task51 {
    abstract static class Employee {
        protected String employeeID;

        public abstract String getFullInfo();

        public Employee() {
        }

        public Employee(String id) {
            employeeID = id;
        }
    }

    static class SalariedEmployee extends Employee {
        protected String socialSecurityNumber;

        public SalariedEmployee(String id, String sn) {
            employeeID = id;
            socialSecurityNumber = sn;
        }

        public String getFullInfo() {
            return employeeID + socialSecurityNumber;
        }
    }

    static class ContractEmployee extends Employee {
        protected String federalTaxIDMember;

        public ContractEmployee(String id, String tax) {
            employeeID = id;
            federalTaxIDMember = tax;
        }

        public String getFullInfo() {
            return employeeID + federalTaxIDMember;
        }
    }
}
