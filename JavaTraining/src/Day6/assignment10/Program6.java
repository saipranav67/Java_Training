package Day6.assignment10;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine(); // Read the sentence
        scanner.close();

        int result = calculateWordSum(inputSentence);
        System.out.println(result);
    }

    public static int calculateWordSum(String sentence) {
        String[] words = sentence.split("\\s+"); // Split sentence into words by spaces
        
        if (words.length < 2) { // Edge case: if there's only one word
            return words[0].length();
        }

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        if (firstWord.equals(lastWord)) {
            return firstWord.length();
        } else {
            return firstWord.length() + lastWord.length();
        }
    }
}

