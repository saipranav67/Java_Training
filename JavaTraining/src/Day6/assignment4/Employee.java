package Day6.assignment4;


import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String firstName;
    private String lastName;

    public Employee(int empId, String firstName, String lastName) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empId, other.empId); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public String toString() {
        return String.format("Employee{ID=%d, FirstName='%s', LastName='%s'}", empId, firstName, lastName);
    }
}

