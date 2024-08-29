package com.LeetCode.PalindromNumber;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 that are not 0 are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;  // Store the original number
        int reversed = 0;  // Variable to hold the reversed number

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;   // Extract the last digit
            reversed = reversed * 10 + digit;  // Append it to the reversed number
            x /= 10;  // Remove the last digit
        }

        // Check if the reversed number is the same as the original number
        return original == reversed;
    }

    public static void main(String[] args) {
    	PalindromeNumber solution = new PalindromeNumber();
        
        // Example test cases
        int[] testNumbers = {121, -121, 10, 12321};
        
        for (int num : testNumbers) {
            boolean result = solution.isPalindrome(num);
            System.out.println(num + " is palindrome: " + result);
        }
    }
}
