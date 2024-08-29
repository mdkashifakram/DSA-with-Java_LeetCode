package com.LeetCode.RomanToIntger;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Define a map for Roman numerals and their integer values
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = 0;
        int length = s.length();

        // Iterate through the string
        for (int i = 0; i < length; i++) {
            // Get the value of the current Roman numeral
            int currentValue = romanToIntMap.get(s.charAt(i));
            
            // If the current value is less than the value of the next numeral, subtract it
            if (i < length - 1 && currentValue < romanToIntMap.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        String[] romanNumerals = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        
        for (String roman : romanNumerals) {
            int result = solution.romanToInt(roman);
            System.out.println("Roman numeral " + roman + " is converted to integer: " + result);
        }
    }
}
