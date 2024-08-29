package com.LeetCode.LengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        // Trim leading and trailing whitespace
        s = s.trim();
        
        // Find the last index of space in the trimmed string
        int lastIndexOfSpace = s.lastIndexOf(' ');
        
        // Calculate the length of the last word
        return s.length() - lastIndexOfSpace - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        String[] testCases = {
            "Hello World",    // Last word: "World"
            "   fly me   to   the moon  ", // Last word: "moon"
            "a",              // Last word: "a"
            " ",              // No words
            "singleword"      // Last word: "singleword"
        };
        
        // Testing the lengthOfLastWord method
        for (String testCase : testCases) {
            int result = solution.lengthOfLastWord(testCase);
            System.out.println("The length of the last word in \"" + testCase + "\" is: " + result);
        }
    }
}
