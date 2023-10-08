package leetcode_problems.bineary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _300_lengthOfLIS {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for (int i = 1; i < n; i++) {
            if (nums[i] > list.get(list.size() - 1)) {
                list.add(nums[i]);
            } else {
                int low = 0;
                int high = list.size() - 1;
                while (low <= high) {
                    int mid = (high + low) / 2;
                    if (list.get(mid) < nums[i]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                list.set(low, nums[i]);
            }
        }

        return list.size();
    }
}
