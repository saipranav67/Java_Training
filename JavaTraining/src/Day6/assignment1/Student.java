package Day6.assignment1;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private Address address;

    public Student(String firstname, String lastname, int age, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(firstname, student.firstname) &&
               Objects.equals(lastname, student.lastname) &&
               Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, address);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " (Age: " + age + "), Address: " + address;
    }
}

