package com.viateur;
import java.util.Scanner;
public class Exercise28 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from the user
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Calculate the length of the string without using built-in functions
            int length = calculateStringLength(input);

            // Display the length of the string
            System.out.println("Length of the string: " + length);

            // Close the scanner
            scanner.close();
        }

        // Function to calculate the length of the string without using built-in functions
        public static int calculateStringLength(String str) {
            int count = 0;
            int index = 0;

            // Iterate through the string using a while loop
            while (true) {
                try {
                    // Attempt to access the character at the current index
                    char c = str.charAt(index);
                    // If successful, increment the count and move to the next index
                    count++;
                    index++;
                } catch (StringIndexOutOfBoundsException e) {
                    // If an exception is caught, it means we have reached the end of the string
                    // Break out of the loop
                    break;
                }
            }

            // Return the calculated length
            return count;
        }
    }


