package leetcode_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089_targetIndices {
    public static void main(String[] args) {
        int[] nums = {71,59,24,95,46,90,19,3,73,100,92,71,34,15,45,59,9,14,95,2,46,76};
        int target = 66;

        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();

        int l = 0;
        int r = nums.length;

        while (l < r) {
            int middle = l + r >> 1;

            if (nums[middle] < target) {
                l = middle+1;
            }
            else {
                r = middle;
            }
        }

        if (l >= nums.length) return ls;
        if (nums[l] == target) {
            ls.add(l);
            for (int i = l+1; i < nums.length; i++) {
                if (nums[i-1] == nums[i]) {
                    ls.add(i);
                }
                else break;
            }
        }

        return ls;
    }
}
