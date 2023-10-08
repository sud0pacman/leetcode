package leetcode_problems;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();

        int x = sc.nextInt();

        System.out.println(removeElement(nums, x));
    }

    public static int removeElement(int[] nums, int val) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = nums.length-1; j > i; j--) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                        break;
                    }
                }
            }
        }

        int count = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == val) {
                ++count;
            }
            else break;
        }

        return nums.length-count;
    }
}
