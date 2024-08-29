package com.LeetCode.SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If target is not found, left is the insertion point
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[][] testArrays = {
            {1, 3, 5, 6},   // Array
            {1, 3, 5, 6},   // Array
            {1, 3, 5, 6},   // Array
            {1, 3, 5, 6}    // Array
        };
        
        int[] targets = {5, 2, 7, 0}; // Target values to test
        
        // Testing the searchInsert method
        for (int i = 0; i < testArrays.length; i++) {
            int[] testArray = testArrays[i];
            int target = targets[i];
            int result = solution.searchInsert(testArray, target);
            System.out.println("Insert position for target " + target + " in array "
                + java.util.Arrays.toString(testArray) + " is: " + result);
        }
    }
}
