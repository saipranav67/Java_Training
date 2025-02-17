package Day6.assignment8;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine(); // Read the string
        char separator = scanner.next().charAt(0); // Read the separator character
        scanner.close();

        String result = reshape(inputString, separator);
        System.out.println(result);
    }

    public static String reshape(String str, char separator) {
        StringBuilder reversed = new StringBuilder(str).reverse(); // Reverse the string
        StringBuilder formatted = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            formatted.append(reversed.charAt(i));
            if (i < reversed.length() - 1) {
                formatted.append(separator); // Add separator except after the last character
            }
        }

        return formatted.toString();
    }
}

