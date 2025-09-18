
public class Assignment {

    // ---------------- Employee (Base Class) ----------------
   
    static abstract class Employee {
        private String name;
        private int employeeId;
        private double salary;

        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public abstract String getRole();
    }

    // ---------------- Manager (Subclass) ----------------
   
    static class Manager extends Employee {
        private String department;

        public Manager(String name, int employeeId, double salary, String department) {
            super(name, employeeId, salary);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public String getRole() {
            return "Manager";
        }
    }

    // ---------------- Developer (Subclass) ----------------
   
    static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, int employeeId, double salary, String programmingLanguage) {
            super(name, employeeId, salary);
            this.programmingLanguage = programmingLanguage;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        public void setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        public String getRole() {
            return "Developer";
        }
    }

    // ---------------- EmployeeUtilities (Helper Class) ----------------
  
    static class EmployeeUtilities {

        public void printEmployeeDetails(Employee emp) {
            System.out.println("Name: " + emp.getName());
            System.out.println("Employee ID: " + emp.getEmployeeId());
            System.out.println("Role: " + emp.getRole());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("-------------------------");
        }

        public void increaseSalary(Employee emp, double amount) {
            double newSalary = emp.getSalary() + amount;
            emp.setSalary(newSalary);
            System.out.println(emp.getName() + "'s new salary: " + emp.getSalary());
        }
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {
      
        Manager manager = new Manager("Alice", 101, 90000, "IT");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

      
        EmployeeUtilities util = new EmployeeUtilities();

       
        util.printEmployeeDetails(manager);
        util.printEmployeeDetails(developer);

        util.increaseSalary(manager, 5000);
        util.increaseSalary(developer, 4000);
    }
}
