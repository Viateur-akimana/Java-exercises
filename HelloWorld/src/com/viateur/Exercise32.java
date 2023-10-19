package com.viateur;
import java.util.Scanner;

public class Exercise32 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice;

            do {
                // Displaying the menu
                System.out.println("MENU");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Modulus");
                System.out.print("Enter your choice: ");
                int operationChoice = scanner.nextInt();

                // Getting two numbers from the user
                System.out.print("Enter your two numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int result = 0;

                // Performing the selected operation
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
                        result = num1 / num2;
                        break;
                    case 5:
                        result = num1 % num2;
                        break;
                    default:
                        System.out.println("Invalid choice!");
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


