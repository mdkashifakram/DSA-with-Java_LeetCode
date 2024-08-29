package com.LeetCode.RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        // Pointer j is used to store the position of elements that are not equal to val.
        int j = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Move it to the position of j and increment j
                nums[j] = nums[i];
                j++;
            }
        }

        // Return the new length of the array with elements other than val
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[][] testArrays = {
            {3, 2, 2, 3},   // Array with value to remove: 3
            {0, 1, 2, 2, 3, 4, 5, 2}, // Array with value to remove: 2
            {1, 2, 3, 4, 5}, // Array with value to remove: 6 (no removal needed)
            {1, 1, 1, 1},   // Array with value to remove: 1 (all elements are removed)
            {5, 6, 7, 8}    // Array with value to remove: 9 (no removal needed)
        };
        
        int[] valuesToRemove = {3, 2, 6, 1, 9};
        
        // Testing the removeElement method
        for (int i = 0; i < testArrays.length; i++) {
            int[] testArray = testArrays[i];
            int val = valuesToRemove[i];
            int newLength = solution.removeElement(testArray, val);

            // Print the array after removing elements equal to val
            System.out.print("Array after removing " + val + ": [");
            for (int j = 0; j < newLength; j++) {
                System.out.print(testArray[j]);
                if (j < newLength - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
