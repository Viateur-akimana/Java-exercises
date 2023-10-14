package com.viateur;

import java.util.Scanner;

public class Exercise26 {
    public static String reverseString(String input){
        StringBuilder reverse = new StringBuilder();
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse.append(input.charAt(i));
        }
        return reverse.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to reverse:-");
        String input = scanner.next();
        String result = reverseString(input);
        System.out.println("The reversed string of input is:-" + result);
    }
}
