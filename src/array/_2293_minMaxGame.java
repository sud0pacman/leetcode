package leetcode_problems.array;

import java.util.ArrayList;
import java.util.List;

public class _2293_minMaxGame {
    public static void main(String[] args) {
        int[] test1 = {1,3,5,2,4,8,2,2}; // 175
        int[] test2 = {999,939,892,175,114,464,850,107}; // 175
        System.out.println(minMaxGame(test1));
    }

    public static int minMaxGame(int[] nums) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        int res = 0;

        int ch = nums.length/2;
        int left = nums.length/2;

        for (int i = 0; i < nums.length / 2; i++) {
            ls1.add(nums[i]);
        }

        for (int i = nums.length / 2; i < nums.length; i++) {
            ls2.add(nums[i]);
        }

        System.out.println(ls1);
        System.out.println(ls2);

        return 0;
    }
}
