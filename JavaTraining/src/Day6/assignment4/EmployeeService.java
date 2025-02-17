package Day6.assignment4;


import java.util.*;

public class EmployeeService {

    private Set<Employee> employeeSet;

    public EmployeeService() {
        this.employeeSet = new TreeSet<>(); 
    }

    public void addEmployee(Employee employee) {
        employeeSet.add(employee);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employeeSet);
    }

    public List<Employee> sortByFirstName() {
        List<Employee> sortedList = new ArrayList<>(employeeSet);
        sortedList.sort(Comparator.comparing(Employee::getFirstName));
        return sortedList;
    }
}

