package com.viateur;

public class Exercise11 {
        public static void main(String[] args) {
            long product = 1;

            // Iterate through numbers from 2 to 100 and check if they are prime
            for (int num = 2; num <= 100; num++) {
                if (isPrime(num)) {
                    product *= num;
                }
            }

            System.out.println("Product of prime numbers between 1 and 100: " + product);
        }

        // Function to check if a number is prime
        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
