package com.viateur;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        checkingPositivity(number);
    }
    public static void checkingPositivity(int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("This is zero");
        }
    }
}
