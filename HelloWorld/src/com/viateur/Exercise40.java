package com.viateur;

public class Exercise40 {
        public static void main(String[] args) {
            int[] numbers = { 28, 30, 34 };
            for (int num : numbers) {
                System.out.println(convertToRaindrops(num));
            }
        }

        public static String convertToRaindrops(int number) {
            StringBuilder result = new StringBuilder();

            if (number % 3 == 0) {
                result.append("Pling");
            }
            if (number % 5 == 0) {
                result.append("Plang");
            }
            if (number % 7 == 0) {
                result.append("Plong");
            }

            // If the number does not have 3, 5, or 7 as factors, append the number itself
            if (result.length() == 0) {
                result.append(number);
            }

            return result.toString();
        }
    }


