package com.LeetCode.PlusOne;
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, just increment it and return the result
                digits[i]++;
                return digits;
            }
            // Set the current digit to 0 and continue to the next more significant digit
            digits[i] = 0;
        }
        
        // If all digits were 9, we need to handle the carryover by creating a new array
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;  // The new array starts with 1, rest are already 0
        return newDigits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[][] testArrays = {
            {1, 2, 3},      // Expected result: [1, 2, 4]
            {4, 3, 2, 1},  // Expected result: [4, 3, 2, 2]
            {9, 9, 9},     // Expected result: [1, 0, 0, 0]
            {0},           // Expected result: [1]
            {8, 9, 9}      // Expected result: [9, 0, 0]
        };
        
        // Testing the plusOne method
        for (int[] testArray : testArrays) {
            int[] result = solution.plusOne(testArray);
            System.out.print("Result after plusOne: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
