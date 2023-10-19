package com.viateur;

public class Exercise34 {
        public static void main(String[] args) {
            int num1 = 13013;
            int num2 = 8;

            System.out.println("Minimum distance between factors of " + num1 + ": " + minDistance(num1));
            System.out.println("Minimum distance between factors of " + num2 + ": " + minDistance(num2));
        }

        // Function to calculate the minimum distance between factors of a number
        public static int minDistance(int num) {
            int minDist = Integer.MAX_VALUE;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    minDist = Math.min(minDist, Math.abs(i - (num / i)));
                }
            }
            return minDist;
        }
    }


