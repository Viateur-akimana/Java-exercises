package com.viateur;
class Calculate {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (method overloading)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator{
    public static void main(String[] args) {
        Calculate calculator = new Calculate();
        int sum1 = calculator.add(5, 10);           // Calls the first add method
        int sum2 = calculator.add(5, 10, 15);       // Calls the second add method
        System.out.println(sum2);
        System.out.println(sum1);
    }
}
