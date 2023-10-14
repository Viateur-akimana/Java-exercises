package com.viateur;

import java.util.Scanner;

public class EXercise22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it is palindrome: - ");
        int number = scanner.nextInt();
        int temp = number;
        int sum=0;
        int remainder;
        while(number > 0){
            remainder = number % 10;
            number = number / 10;
            sum = (sum * 10) + remainder;
        }
        if(temp == sum){
            System.out.println("The number is palindrome:-");
        }else {
        System.out.println("The number is not palindrome");
    }
    }
}
