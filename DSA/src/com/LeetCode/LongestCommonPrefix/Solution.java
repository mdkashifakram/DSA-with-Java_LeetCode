package com.LeetCode.LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Check for empty input or array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize the prefix with the first string
        String prefix = strs[0];

        // Iterate over the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // While the current prefix is not a prefix of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        // Return the longest common prefix
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"", "nonempty", "string"},
            {"same", "same", "same"},
            {"prefix", "prefixes", "prefixation"}
        };

        for (String[] testCase : testCases) {
            String result = solution.longestCommonPrefix(testCase);
            System.out.println("Longest common prefix for " + String.join(", ", testCase) + " is: " + result);
        }
    }
}
