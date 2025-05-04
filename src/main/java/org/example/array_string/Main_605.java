package org.example.array_string;

public class Main_605 {
    public static void main(String[] args) {
        Solution_605 solution605 = new Solution_605();
        int[] flowerbed = {0,0,1,0,0};
        System.out.println(solution605.canPlaceFlowers(flowerbed, 1));
    }
}

class Solution_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1){
                continue;
            }

            int left = i == 0 ? 0 : flowerbed[i - 1];
            int right = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];

            if (right == 0 && left == 0) {
                flowerbed[i] = 1;
                n--;
            }

        }

        return n <= 0;
    }
}
