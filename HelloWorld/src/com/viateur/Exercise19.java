package com.viateur;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercise19 {
    public static double calculateArea(double radius){
        double PI = 3.14;
        return PI * radius * radius;
    }
    public static double calculateCircumference(double radius){
        double PI = 3.14;
        return 2*PI* radius;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:-");
        double radius = scanner.nextDouble();
        double area = calculateArea(radius);
        System.out.println("The area of the circle is: " + area);
        double circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
