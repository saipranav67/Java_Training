package Day6.assignment5;

import java.util.Scanner;

public class Captalise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        scanner.close();

        String result = getCapitalized(input);
        System.out.println("Capitalized Sentence:");
        System.out.println(result);
    }

    public static String getCapitalized(String str) {
        String[] words = str.split("\\s+"); // Split by spaces
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0))) // Capitalize first letter
                        .append(word.substring(1).toLowerCase()).append(" "); // Keep the rest lowercase
            }
        }

        return capitalizedSentence.toString().trim(); // Trim to remove trailing space
    }
}

