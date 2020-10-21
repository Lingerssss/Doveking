package Leetcode;

import java.util.Arrays;

public class Leetcode_5476找出数组游戏的赢家 {
    public int getWinner(int[] arr, int k) {
        if (k >= arr.length - 1) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < arr.length) {
            System.out.println("right: " + right);
            System.out.println("count: " + count);
            if (count == k) {
                break;
            }
            if (arr[left] < arr[right]) {
                count = 0;
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            count++;
            right++;

        }
        System.out.println(arr[left]);
        return arr[left];


    }
}
