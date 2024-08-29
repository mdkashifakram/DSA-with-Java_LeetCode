package com.LeetCode.TwoSum;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers we have seen so far and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            
            // Check if the complement is in the map
            if (map.containsKey(complement)) {
                // If found, return the indices
                return new int[] { map.get(complement), i };
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // In case there's no solution (though the problem guarantees one)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
    	TwoSum solution = new TwoSum();
        
        // Example test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
