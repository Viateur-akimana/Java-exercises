package com.viateur;

public class Exercise39 {
        public static void main(String[] args) {
            int[] numbers = { 12344321, 120055002, 111, 10001, 0, -12345, -54321 };

            for (int num : numbers) {
                System.out.println(reverseInteger(num));
            }
        }

        public static int reverseInteger(int number) {
            int reversed = 0;
            boolean isNegative = false;

            // Check if the number is negative
            if (number < 0) {
                isNegative = true;
                number = -number; // Make the number positive for processing
            }

            // Reverse the number
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            // Add the negative sign if the input number was negative
            if (isNegative) {
                reversed = -reversed;
            }

            return reversed;
        }
    }


