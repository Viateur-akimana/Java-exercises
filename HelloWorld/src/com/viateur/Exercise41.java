package com.viateur;

public class Exercise41 {
        public static int countDigit(int number, int digit) {
            // Check if the number or digit is negative
            if (number < 0 || digit < 0) {
                return -1;
            }

            // Convert the number to a string
            String numberStr = Integer.toString(number);

            // Initialize count to store the number of occurrences of the digit
            int count = 0;

            // Iterate through the characters of the number string and count the occurrences of the digit
            for (int i = 0; i < numberStr.length(); i++) {
                if (Character.getNumericValue(numberStr.charAt(i)) == digit) {
                    count++;
                }
            }

            // Return the count of occurrences of the digit
            return count;
        }

        public static void main(String[] args) {
            // Examples
            System.out.println(countDigit(32121, 1)); // Output: 2
            System.out.println(countDigit(33331, 3)); // Output: 4
            System.out.println(countDigit(33331, 6)); // Output: 0
            System.out.println(countDigit(3, 3));      // Output: 1
            System.out.println(countDigit(-543, 3));    // Output: -1
        }

}
