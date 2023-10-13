package com.viateur;
import java.util.Scanner;
public class Exercise7 {
       public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter first number:");
           int number1 = scanner.nextInt();
           System.out.print("Enter second number:");
           int number2 = scanner.nextInt();
           int temp = number1;
           number1 = number2;
           number2 = temp;
           System.out.println("The number1 swapped:" + number1);
           System.out.print("The number2 swapped:" + number2);
       }
    }


