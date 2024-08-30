package com.LeetCode.SingleNumber;

public class Solution {
    
    // Method to find the single number in the array
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation to cancel out pairs
        }
        return result;
    }

    // Main method to test the singleNumber method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number in [2, 2, 1] is: " + solution.singleNumber(nums1)); // Output: 1

        // Example 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number in [4, 1, 2, 1, 2] is: " + solution.singleNumber(nums2)); // Output: 4

        // Example 3
        int[] nums3 = {1};
        System.out.println("Single number in [1] is: " + solution.singleNumber(nums3)); // Output
}
}