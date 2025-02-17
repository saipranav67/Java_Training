package Day6.assignment1;


import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstname = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastname = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Enter Address Details:");
            System.out.print("Street: ");
            String street = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("Zip Code: ");
            String zipCode = scanner.nextLine();

            Address address = new Address(street, city, state, zipCode);
            Student student = new Student(firstname, lastname, age, address);

            if (studentService.addStudent(student)) {
                System.out.println("Student added successfully.");
            } else {
                System.out.println("Duplicate student! Not added.");
            }
        }

        System.out.println("\nStored Students:");
        studentService.displayStudents();

        scanner.close();
    }
}

