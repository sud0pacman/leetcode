package hash_table;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2099_maxSubsequence {
    public static void main(String[] args) {
        int[] nums = {-75,50};
        int k = 2;

        System.out.println(Arrays.toString(maxSubsequence(nums, k)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        int[] safe = new int[nums.length];
        System.arraycopy(nums, 0, safe, 0, nums.length);

        Arrays.sort(nums);
        int len = nums.length-k-1;

        List<Integer> ls = new ArrayList<>();

        for(int i = nums.length-1; i > len; --i) {
            ls.add(nums[i]);
        }

        int[] res = new int[k];
        int ind = 0;

        for (int i : safe) {
            if (ls.contains(i)) res[ind++] = i;
        }

        return res;
    }
}
