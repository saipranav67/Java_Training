package Day6.assignment7;

import java.util.Scanner;

public class PanCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String panNumber = scanner.nextLine();
        scanner.close();

        if (validatePAN(panNumber)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean validatePAN(String pan) {
        String regex = "^[A-Z]{3}\\d{4}[A-Z]$"; 
        return pan.matches(regex);
    }
}
