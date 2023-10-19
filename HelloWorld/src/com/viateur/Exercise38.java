package com.viateur;

public class Exercise38 {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {3, 2, 1, 4, 5};
            int[] array3 = {3, 2, 1, 4, 1};
            int[] array4 = {1, 2, 3, 4};
            int[] array5 = {};

            System.out.println(isCenteredArray(array1)); // Output: 0
            System.out.println(isCenteredArray(array2)); // Output: 1
            System.out.println(isCenteredArray(array3)); // Output: 0
            System.out.println(isCenteredArray(array4)); // Output: 0
            System.out.println(isCenteredArray(array5)); // Output: 0
        }

        // Function to check if the array is centered
        public static int isCenteredArray(int[] arr) {
            int length = arr.length;

            // Check if the array has an odd number of elements
            if (length % 2 == 0) {
                return 0; // Not a centered array (no middle element)
            }

            int middleIndex = length / 2;
            int middleElement = arr[middleIndex];

            // Check if the middle element is strictly less than all other elements
            for (int i = 0; i < length; i++) {
                if (i != middleIndex && arr[i] <= middleElement) {
                    return 0; // Not a centered array (middle element is not strictly less than all others)
                }
            }

            return 1; // Centered array
        }
    }


