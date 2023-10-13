package com.viateur;

import java.util.Scanner;

public class Exercise15 {
    public static void checkDividend(int dividend, int divisor){
        int answer = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quontient:" + answer);
        System.out.println("remainder:" + remainder);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
            checkDividend(dividend,divisor);


    }
}
