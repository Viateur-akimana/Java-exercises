package com.viateur;

import java.util.Scanner;

public class Exercise29 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from the user
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Convert the string to uppercase using the function
            String uppercaseString = convertToUppercase(input);

            // Display the uppercase string
            System.out.println("Uppercase String: " + uppercaseString);

            // Close the scanner
            scanner.close();
        }

        // Function to convert a string to uppercase
        public static String convertToUppercase(String str) {
            char[] charArray = str.toCharArray();

            // Iterate through the characters and convert them to uppercase
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isLowerCase(charArray[i])) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }

            // Convert char array back to string
            return new String(charArray);
        }
    }

