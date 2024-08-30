package com.LeetCode.ExcelSheetColumnTitle;

public class Solution {
	public String convertToTitle(int columnNumber) {
		StringBuilder result=new StringBuilder();
		while(columnNumber>0) {
			columnNumber--;
			char ch=(char)('A'+columnNumber%26);
			result.insert(0, ch);
			columnNumber/=26;
		}
		return result.toString();
	}

    // Main method to test the convertToTitle method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int columnNumber1 = 1;
        System.out.println("Column number 1 corresponds to: " + solution.convertToTitle(columnNumber1)); // Output: A

        // Example 2
        int columnNumber2 = 28;
        System.out.println("Column number 28 corresponds to: " + solution.convertToTitle(columnNumber2)); // Output: AB

        // Example 3
        int columnNumber3 = 701;
        System.out.println("Column number 701 corresponds to: " + solution.convertToTitle(columnNumber3)); // Output: ZY

        // Example 4
        int columnNumber4 = 702;
        System.out.println("Column number 702 corresponds to: " + solution.convertToTitle(columnNumber4)); // Output: ZZ

        // Example 5
        int columnNumber5 = 18278;
        System.out.println("Column number 18278 corresponds to: " + solution.convertToTitle(columnNumber5)); // Output: ZZ

    }
}
