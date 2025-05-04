package org.example.array_string;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_1768 {
    public static void main(String[] args) {
        Solution_1768 s1 = new Solution_1768();
        String s = s1.mergeAlternately("ab", "pqrs");
        System.out.println(s);
    }
}

class Solution_1768 {
    public String mergeAlternately(String word1, String word2) {
        if (!(!word1.isEmpty() && word1.length() <= 100) ||
                !(!word2.isEmpty() && word2.length() <= 100) ||
                !isAllLowercaseLetters(word1) ||
                !isAllLowercaseLetters(word2)
        ) {
            return "Error";
        }

        int n = Math.max(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (word1.length() > i) {
                sb.append(word1.charAt(i));
            }

            if (word2.length() > i) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }

    private boolean isAllLowercaseLetters(String input) {
        return input != null && input.matches("[a-z]+");
    }
}