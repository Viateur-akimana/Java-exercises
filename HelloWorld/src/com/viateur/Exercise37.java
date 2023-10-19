package com.viateur;

public class Exercise37 {

        public static void main(String[] args) {
            int N = 10; // Change this value to calculate for a different N
            int squareOfSum = squareOfSum(N);
            int sumOfSquares = sumOfSquares(N);
            int difference = squareOfSum - sumOfSquares;

            System.out.println("Square of the sum: " + squareOfSum);
            System.out.println("Sum of the squares: " + sumOfSquares);
            System.out.println("Difference: " + difference);
        }

        // Function to calculate the square of the sum of first N natural numbers
        public static int squareOfSum(int N) {
            int sum = (N * (N + 1)) / 2; // Sum of first N natural numbers formula
            return sum * sum;
        }

        // Function to calculate the sum of the squares of first N natural numbers
        public static int sumOfSquares(int N) {
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i * i;
            }
            return sum;
        }
    }


