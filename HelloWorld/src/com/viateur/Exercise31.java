package com.viateur;

public class Exercise31 {
        public static String removeSpaces(String input) {
            // Remove all spaces from the input string
            StringBuilder result = new StringBuilder();
            for (char ch : input.toCharArray()) {
                if (ch != ' ') {
                    result.append(ch);
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            // Example input string with spaces
            String inputString = "Hello, World! This is a sample string with spaces.";

            // Call the removeSpaces function and print the result
            String result = removeSpaces(inputString);
            System.out.println("Original String: " + inputString);
            System.out.println("String after removing spaces: " + result);
        }
    }


