package com.viateur;

public class Exercise2 {

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        int count = 0;
        while (count < 10) {
            sum += num;
            num++;
            count++;
        }

        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}

