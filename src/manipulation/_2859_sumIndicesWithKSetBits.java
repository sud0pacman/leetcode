package leetcode_problems.manipulation;

import java.util.ArrayList;
import java.util.List;

public class _2859_sumIndicesWithKSetBits {
    public static void main(String[] args) {
        int[] ns = {5,10,1,5,2};
        List<Integer> nums = new ArrayList<>();
        for (int n : ns) nums.add(n);
        int k = 1;

        System.out.println(sumIndicesWithKSetBits(nums, k));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        int len = nums.size();
        for (int i = 0; i < len; ++i) {
            int c = 0;    // counter
            int n = i;
            while (n != 0) {
                n &= n-1;
                ++c;
            }

            if (c == k)
                sum = sum + nums.get(i);
        }

        return sum;
    }
}
