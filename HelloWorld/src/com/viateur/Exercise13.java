package com.viateur;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficent of a:-");
        int a = scanner.nextInt();
        System.out.println("Enter the coefficent of b:-");
        int b = scanner.nextInt();
        System.out.println("Enter the coefficent of c:-");
        int c = scanner.nextInt();
        double delta = b * b - 4 * a * c;
        if(delta > 0){
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2 * a);
            System.out.println("The value of x1 is " + x1);
            System.out.println("The values of x2 is " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The root of our polynomial is " + x);
        } else {
            System.out.println("The delta of negative number doesn't exist");
        }

    }
}
