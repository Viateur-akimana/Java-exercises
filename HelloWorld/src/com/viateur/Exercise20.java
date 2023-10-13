package com.viateur;

import java.util.Scanner;

public class Exercise20 {
    public static int volume(int side){
        return side * side * side;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the cube:-");
        int side = scanner.nextInt();
        int volume = volume(side);
        System.out.println("The volume of the cube is :" + volume);
    }
}
