package Day6.assignment8;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine(); 
        char separator = scanner.next().charAt(0); 
        scanner.close();

        String result = reshape(inputString, separator);
        System.out.println(result);
    }

    public static String reshape(String str, char separator) {
        StringBuilder reversed = new StringBuilder(str).reverse(); 
        StringBuilder formatted = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            formatted.append(reversed.charAt(i));
            if (i < reversed.length() - 1) {
                formatted.append(separator); 
            }
        }

        return formatted.toString();
    }
}

