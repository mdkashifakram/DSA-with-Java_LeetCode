package com.LeetCode.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[][] testArrays = {
            {1, 2, 3, 4},      // Expected result: false (no duplicates)
            {1, 2, 3, 1},      // Expected result: true (1 is duplicated)
            {5, 6, 7, 8, 9},   // Expected result: false (no duplicates)
            {1, 1, 1, 1},      // Expected result: true (1 is duplicated)
            {}                // Expected result: false (empty array, no duplicates)
        };
        
        // Testing the containsDuplicate method
        for (int[] nums : testArrays) {
            boolean result = solution.containsDuplicate(nums);
            System.out.print("Array: [");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("] - Contains duplicate: " + result);
        }
    }
}
