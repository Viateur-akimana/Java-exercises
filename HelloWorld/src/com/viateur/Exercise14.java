package com.viateur;
import java.util.Scanner;

public class Exercise14 {
    public static double toFahrenheit(double celsius) {
        final double PEOPLE= 1.8;
        return (celsius * PEOPLE) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degrees in celsius:");
        double celsiusTemperature = scanner.nextDouble();
        double fahrenheitTemperature = toFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " degrees Celsius is equal to " + fahrenheitTemperature + " degrees Fahrenheit.");
    }
}
