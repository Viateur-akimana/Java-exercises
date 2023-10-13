package com.viateur;

import java.util.Scanner;

public class Exercise18 {
    public static String reverse(String fname, String lname){
        String temp = fname;
        fname = lname;
        lname= temp;
        return fname + lname;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the firstname:");
        String firstName = scanner.next();
        System.out.println(("Enter the lastname"));
        String lastName = scanner.next();

        String reversedName = reverse(firstName, lastName);
        System.out.println("The name in reverse" + reversedName);
    }
}
