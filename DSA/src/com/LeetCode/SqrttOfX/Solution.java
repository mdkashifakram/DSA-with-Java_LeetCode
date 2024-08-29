package com.LeetCode.SqrttOfX;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 0;
        int right = x;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid; // Use long to avoid overflow
            
            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right; // When the loop ends, right is the integer part of the square root
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[] testValues = {
            4,        // Expected result: 2
            8,        // Expected result: 2 (since sqrt(8) is approximately 2.828)
            16,       // Expected result: 4
            1,        // Expected result: 1
            0         // Expected result: 0
        };
        
        // Testing the mySqrt method
        for (int x : testValues) {
            int result = solution.mySqrt(x);
            System.out.println("Square root of " + x + " is: " + result);
        }
    }
}
