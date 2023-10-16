package com.viateur;

import java.util.Scanner;

public class Exercise32 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice;

            do {
                // Displaying the calculator menu
                System.out.println("MENU");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Modulus");

                // Asking for user input
                System.out.print("Enter your choice: ");
                int operationChoice = scanner.nextInt();
                System.out.print("Enter your two numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                // Performing the chosen operation
                int result = 0;
                switch (operationChoice) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            result = num1 % num2;
                        } else {
                            System.out.println("Error: Modulus by zero!");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        continue;
                }

                // Displaying the result
                System.out.println("Result: " + result);

                // Asking if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'y' || choice == 'Y');

            // Closing the scanner
            scanner.close();
        }
    }


