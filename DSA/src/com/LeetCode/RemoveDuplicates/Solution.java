package com.LeetCode.RemoveDuplicates;

class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, return 0.
        if (nums.length == 0) {
            return 0;
        }

        // Pointer j is used to store the position of unique elements.
        int j = 0;

        // Iterate through the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // If current element is different from the last unique element found
            if (nums[i] != nums[j]) {
                // Increment j and update nums[j] with the new unique element
                j++;
                nums[j] = nums[i];
            }
        }
        
        // Return the number of unique elements, which is j + 1
        return j + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[][] testArrays = {
            {1, 1, 2},        // Array after removing duplicates: [1, 2]
            {0, 0, 1, 1, 2, 2, 3, 3, 4}, // Array after removing duplicates: [0, 1, 2, 3, 4]
            {1, 2, 3, 4, 5}, // Array after removing duplicates: [1, 2, 3, 4, 5]
            {1, 1, 1, 1},    // Array after removing duplicates: [1]
            {}               // Empty array
        };

        // Testing the removeDuplicates method
        for (int[] testArray : testArrays) {
            int length = solution.removeDuplicates(testArray);
            System.out.print("Array after removing duplicates: [");
            for (int i = 0; i < length; i++) {
                System.out.print(testArray[i]);
                if (i < length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
