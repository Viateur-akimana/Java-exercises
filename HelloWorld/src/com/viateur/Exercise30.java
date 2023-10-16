package com.viateur;

public class Exercise30 {

        public static boolean isPalindromeUsingBuiltInFunctions(String str) {
            // Remove non-alphanumeric characters and convert to lowercase
            String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Compare the original and reversed strings
            return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
        }

        public static void main(String[] args) {
            String input = "A man, a plan, a canal, Panama!";
            if (isPalindromeUsingBuiltInFunctions(input)) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }
        }
    }

