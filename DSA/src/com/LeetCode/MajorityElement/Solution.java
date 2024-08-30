package com.LeetCode.MajorityElement;

public class Solution {

    // Method to find the majority element in the array
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    // Main method to test the majorityElement method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority element in [3, 2, 3] is: " + solution.majorityElement(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element in [2, 2, 1, 1, 1, 2, 2] is: " + solution.majorityElement(nums2)); // Output: 2

        // Example 3
        int[] nums3 = {1, 1, 2, 2, 2};
        System.out.println("Majority element in [1, 1, 2, 2, 2] is: " + solution.majorityElement(nums3)); // Output: 2
    }
}
