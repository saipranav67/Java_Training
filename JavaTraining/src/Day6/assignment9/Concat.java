package Day6.assignment9;

import java.util.Scanner;

public class Concat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine(); 
        scanner.close();

        String result = getLastLetter(inputSentence);
        System.out.println(result);
    }

    public static String getLastLetter(String sentence) {
        String[] words = sentence.split("\\s+"); 
        StringBuilder lastLetters = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char lastChar = word.charAt(word.length() - 1); 
                lastLetters.append(Character.toUpperCase(lastChar)); 
            }
        }

        return lastLetters.toString();
    }
}

