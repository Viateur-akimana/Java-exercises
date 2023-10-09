package com.viateur;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Christmas tree: ");
        int length = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = length - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = length - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println("| |");
        }
        scanner.close();
    }
}