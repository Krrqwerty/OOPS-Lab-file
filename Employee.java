public class Employee {
    private static int totalEmployees = 0;
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    
    public Employee() {
        this.employeeID = 0;
        this.name = "Default Name";
        this.department = "Default Department";
        this.salary = 0.0;
        totalEmployees++;
    }

    
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public Employee(String department, int employeeID, String name, double salary) {
        this.department = department;
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    
    public double calculateSalary() {
        return this.salary;
    }

    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        
    
        Employee emp2 = new Employee(101, "Ram", "HR", 50000);
        Employee emp3 = new Employee(102, "Shyam", "IT", 60000);
        
    
        emp1.displayEmployeeInfo();
        System.out.println();
        emp2.displayEmployeeInfo();
        System.out.println();
        emp3.displayEmployeeInfo();
        
        System.out.println();
    
        Employee.displayTotalEmployees();
    }
}

