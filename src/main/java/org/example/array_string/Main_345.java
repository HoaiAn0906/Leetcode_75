package org.example.array_string;


import java.util.*;

/*
Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"

 */
public class Main_345 {
    public static void main(String[] args) {
        Solution_345 solution345 = new Solution_345();

        System.out.println(solution345.reverseVowels("IceCreAm"));
    }
}

class Solution_345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            if (!isVowel(Character.toLowerCase(s.charAt(left)))) {
                left++;
                continue;
            }

            if (!isVowel(Character.toLowerCase(s.charAt(right)))) {
                right--;
                continue;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}