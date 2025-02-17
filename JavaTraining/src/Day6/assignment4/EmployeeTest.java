package Day6.assignment4;



import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        // Adding Employees
        employeeService.addEmployee(new Employee(102, "John", "Doe"));
        employeeService.addEmployee(new Employee(101, "Alice", "Smith"));
        employeeService.addEmployee(new Employee(104, "Bob", "Brown"));
        employeeService.addEmployee(new Employee(103, "Eve", "Johnson"));
        employeeService.addEmployee(new Employee(105, "Charlie", "Williams"));
        employeeService.addEmployee(new Employee(102, "John", "Doe")); // Duplicate, will be ignored

        // Display Employees sorted by empId (default)
        System.out.println("Employees Sorted by EmpId:");
        employeeService.getEmployees().forEach(System.out::println);

        // Display Employees sorted by First Name
        System.out.println("\nEmployees Sorted by First Name:");
        List<Employee> sortedByFirstName = employeeService.sortByFirstName();
        sortedByFirstName.forEach(System.out::println);
    }
}
