package com.viateur;

public class Exercise35 {

        public static void main(String[] args) {
            int number1 = 32121;
            int digit1 = 1;
            int number2 = 33331;
            int digit2 = 3;
            int number3 = 6;
            int digit3 = 3;

            System.out.println(countDigit(number1, digit1)); // Output: 2
            System.out.println(countDigit(number2, digit2)); // Output: 4
            System.out.println(countDigit(number2, digit3)); // Output: 0
            System.out.println(countDigit(number3, digit3)); // Output: 1
            System.out.println(countDigit(-543, digit3)); // Output: -1
        }

        // Function to count the occurrence of a digit in a number
        public static int countDigit(int number, int digit) {
            // Check if the number or digit is negative
            if (number < 0 || digit < 0) {
                return -1;
            }

            // Convert the number and digit to strings
            String numberStr = String.valueOf(number);
            String digitStr = String.valueOf(digit);

            // Count the occurrences of the digit in the number
            int count = 0;
            for (int i = 0; i < numberStr.length(); i++) {
                if (numberStr.charAt(i) == digitStr.charAt(0)) {
                    count++;
                }
            }

            return count;
        }
    }


