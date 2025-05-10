package org.example.array_string;

import java.util.Arrays;

public class Main_238 {
    public static void main(String[] args) {
        Solution_238 solution238 = new Solution_238();
        int[] nums = {1,2,3,4};

        solution238.productExceptSelf(nums);
    }
}

class Solution_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 2; i >= 0; i--) {
            right *= nums[i + 1];
            answer[i] *= right;
        }

        return answer;
    }
}
