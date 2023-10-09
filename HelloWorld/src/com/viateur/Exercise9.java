package com.viateur;

public class Exercise9 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 20; i += 2) {
            product *= i;

        }
        System.out.println("Product of odd numbers between 1 and 20: " + product);
    }
}

