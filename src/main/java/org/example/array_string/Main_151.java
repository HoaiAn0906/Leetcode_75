package org.example.array_string;

public class Main_151 {
    public static void main(String[] args) {
        Solution_151 solution151 = new Solution_151();

        System.out.println(solution151.reverseWords("   a good   example   "));
    }
}

class Solution_151 {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = word.length - 1; i >= 0; i--) {
            stringBuilder.append(word[i]);
            if (i != 0)
                stringBuilder.append(" ");

        }

        return stringBuilder.toString();
    }
}