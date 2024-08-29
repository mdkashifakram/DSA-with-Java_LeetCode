package com.LeetCode.ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        // Create a StringBuilder to store the normalized string
        StringBuilder normalized = new StringBuilder();
        
        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            // Check if the character is a letter or digit
            if (Character.isLetterOrDigit(c)) {
                // Convert to lower case and append to the normalized StringBuilder
                normalized.append(Character.toLowerCase(c));
            }
        }

        // Convert the StringBuilder to a string
        String normalizedString = normalized.toString();
        
        // Initialize two pointers for checking palindrome
        int left = 0;
        int right = normalizedString.length() - 1;
        
        // Check characters from both ends towards the center
        while (left < right) {
            if (normalizedString.charAt(left) != normalizedString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        // All characters matched, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        String[] testStrings = {
            "A man, a plan, a canal: Panama", // Expected result: true
            "race a car",                    // Expected result: false
            " ",                             // Expected result: true (empty string after normalization)
            "12321",                          // Expected result: true
            "No 'x' in Nixon"                 // Expected result: true
        };
        
        // Testing the isPalindrome method
        for (String s : testStrings) {
            boolean result = solution.isPalindrome(s);
            System.out.println("\"" + s + "\" is a palindrome: " + result);
        }
    }
}
