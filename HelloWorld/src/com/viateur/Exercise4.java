package com.viateur;
import java.util.Scanner;
public class Exercise4 {
       public static void main(String[] args) {
           Scanner number = new Scanner(System.in);
           String repeat;
           do {
               System.out.println("Enter the first number:-");
               int firstNumber = number.nextInt();
               System.out.println("Enter the second number:-");
               int secondNumber = number.nextInt();
               int sum = firstNumber + secondNumber;
               System.out.println("The sum of entered numbers is:-" + sum);
               System.out.print("Do you wish to terminate the program (Y/n)");
               repeat = number.next();

           }
           while (repeat.equals("Y"));
       }
    }

