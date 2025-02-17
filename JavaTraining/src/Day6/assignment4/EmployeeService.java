package Day6.assignment4;


import java.util.*;

public class EmployeeService {

    private Set<Employee> employeeSet;

    public EmployeeService() {
        this.employeeSet = new TreeSet<>(); // TreeSet ensures sorting by empId
    }

    // 1. Add employees
    public void addEmployee(Employee employee) {
        employeeSet.add(employee);
    }

    // 2. Get all employees
    public List<Employee> getEmployees() {
        return new ArrayList<>(employeeSet);
    }

    // 3. Sort by first name using Comparator
    public List<Employee> sortByFirstName() {
        List<Employee> sortedList = new ArrayList<>(employeeSet);
        sortedList.sort(Comparator.comparing(Employee::getFirstName));
        return sortedList;
    }
}

