package org.example.array_string;

import java.util.HashMap;
import java.util.Map;

public class Main_443 {
    public static void main(String[] args) {
        Solution_443 solution443 = new Solution_443();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(solution443.compress(chars));
    }
}

class Solution_443 {
    public int compress(char[] chars) {
        int num = chars.length;
        if (num == 1) {
            return 1;
        }

        int writeIndex = 0;
        int readIndex = 0;

        while (readIndex < num) {
            char currentChar = chars[readIndex];
            int count = 0;

            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            chars[writeIndex++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }

        return writeIndex;
    }
}
