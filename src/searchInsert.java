package leetcode_problems;

import java.util.Scanner;

public class searchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        int t = sc.nextInt();

        System.out.println(searchInsert(arr, t));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            } else if (nums[i] < target) {
                index = i+1;
            }
        }

        return index;
    }
}
