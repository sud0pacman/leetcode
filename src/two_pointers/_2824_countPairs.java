package leetcode_problems.two_pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2824_countPairs {
    public static void main(String[] args) {
        int[] ns = {-6, 2, 5, -2, -7, -1, 3};
        List<Integer> nums = new ArrayList<>();
        for (int n : ns) nums.add(n);
        int target = 2;

        System.out.println(countPairs(nums, target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int[] arr = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                if (sum < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
