package com.viateur;

public class Exercise33 {

        public static void main(String[] args) {
            int n = 6; // Change this value to find a different nth prime number
            int prime = findNthPrime(n);
            System.out.println("The " + n + "th prime number is: " + prime);
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Method to find the nth prime number
        public static int findNthPrime(int n) {
            int count = 0;
            int num = 2; // Starting from the first prime number
            int prime = 0;

            while (count < n) {
                if (isPrime(num)) {
                    prime = num;
                    count++;
                }
                num++;
            }
            return prime;
        }
    }


