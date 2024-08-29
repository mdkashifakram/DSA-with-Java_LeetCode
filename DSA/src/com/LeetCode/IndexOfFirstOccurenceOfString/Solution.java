package com.LeetCode.IndexOfFirstOccurenceOfString;

class Solution {
    public int strStr(String haystack, String needle) {
        // Handle the case where needle is empty
        if (needle.isEmpty()) {
            return 0;
        }
        
        // Find the index of the first occurrence of needle in haystack
        int index = haystack.indexOf(needle);
        
        // Return the index
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        String[] haystacks = {"hello", "leetcode", "a", "mississippi"};
        String[] needles = {"ll", "leeto", "", "iss"};

        // Testing the strStr method
        for (int i = 0; i < haystacks.length; i++) {
            int result = solution.strStr(haystacks[i], needles[i]);
            System.out.println("The index of \"" + needles[i] + "\" in \"" + haystacks[i] + "\" is: " + result);
        }
    }
}
