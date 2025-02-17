package Day6.assignment1;


import java.util.HashSet;
import java.util.Set;

public class StudentService {
    private Set<Student> studentSet;

    public StudentService() {
        studentSet = new HashSet<>();
    }

    public boolean addStudent(Student student) {
        return studentSet.add(student);
    }

    public void displayStudents() {
        if (studentSet.isEmpty()) {
            System.out.println("No students in the set.");
            return;
        }
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }


}

