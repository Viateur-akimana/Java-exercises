package com.viateur;
import java.util.Scanner;
public class Exercise3 {
        // Function to calculate factorial
        public static int factorial(int num) {
            if (num == 0 || num == 1) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to calculate its factorial: ");
            try {
                int number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    int result = factorial(number);
                    System.out.println("Factorial of " + number + " is " + result);
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } finally {
                scanner.close();
            }
        }
    }


