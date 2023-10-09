package com.viateur;
import java.util.Scanner;
public class Exercise6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is negative, positive, or zero
            if (number < 0) {
                System.out.println("The number is negative.");
            } else if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is zero.");
            }

            // Close the scanner
            scanner.close();
        }
    }


