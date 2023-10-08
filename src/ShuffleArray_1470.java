package leetcode_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray_1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(shuffle(arr, n / 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] resArr = new int[n*2];

        int j = 0;
        for (int i = 0; i < n; i++) {
            resArr[j] = nums[i];
            resArr[j+1] = nums[n+i];

            j += 2;
        }

        return resArr;
    }
}
