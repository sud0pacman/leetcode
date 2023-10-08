package leetcode_problems;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] nums = new int[x];

        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            boolean isHave = false;
            for(int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isHave = true;
                    break;
                }
            }

            if(!isHave) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                ++count;
            }
        }

        return count;
    }
}
