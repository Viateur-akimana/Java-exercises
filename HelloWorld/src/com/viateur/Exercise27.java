package com.viateur;
import java.util.Scanner;

public class Exercise27 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from the user
            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();

            // Calculate number of characters without spaces
            int charactersWithoutSpaces = input.replace(" ", "").length();

            // Calculate total number of characters (including spaces)
            int totalCharacters = input.length();

            // Calculate number of words
            String[] words = input.split("\\s+");
            int numberOfWords = words.length;

            // Display the results
            System.out.println("Number of characters without spaces: " + charactersWithoutSpaces);
            System.out.println("Total number of characters (including spaces): " + totalCharacters);
            System.out.println("Number of words: " + numberOfWords);

            // Close the scanner
            scanner.close();
        }
    }




