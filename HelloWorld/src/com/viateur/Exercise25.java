package com.viateur;

import java.util.Scanner;

public class Exercise25 {
    public static void checkCharacter(char character){
        if(Character.isDigit(character)){
            System.out.println("The entered character is digit" + character);
        }
        else if (Character.isLetter(character)){
            System.out.println("The character entered is letter" + character);
        }
        else {
            System.out.println("Entered character is neither letter nor digit");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to check:-");
        char character = scanner.next().charAt(0);
        checkCharacter(character);

    }
}
