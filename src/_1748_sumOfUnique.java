package leetcode_problems;

import java.util.Arrays;

public class _1748_sumOfUnique {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2};

        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int[] digits = new int[101];

//        for (int num : nums) {
//            digits[num]++;
//        }

//        int sum = 0;
//        for (int num : nums) {
//            if (digits[num] == 1) {
//                sum += num;
//            }
//        }

        int i, sum = 0;

        for (i = 0; i < nums.length; i++) {
            digits[nums[i]]++;
        }


        for (i = 0; i < nums.length; i++) {
            if (digits[nums[i]] == 1) {
                sum += nums[i];
            }
        }



        return sum;
    }
}