package com.viateur;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:-");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number:-");
        int num3 = scanner.nextInt();

        int[] numbers = {num1,num2,num3};
        Arrays.sort(numbers);
        System.out.println("The sorted numbers in ascending order is" + " " +  num1+ " " + num2+ " " + num3);
        scanner.close();
    }
}
