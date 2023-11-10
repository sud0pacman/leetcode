package array;

import java.util.ArrayList;
import java.util.List;

public class _228_summaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] - nums[i] == -1) {
                ++cnt;
            } else {
                if (cnt == 1) {
                    res.add(String.valueOf(nums[i - 1]));
                } else {
                    StringBuilder list = new StringBuilder();
                    list.append(nums[i - cnt]);
                    list.append("->");
                    list.append(nums[i-1]);
                    res.add(list.toString());
                }
                cnt = 1;
            }
        }

        if (cnt == 1) {
            res.add(String.valueOf(nums[n - 1]));
        } else {
            String sb = String.valueOf(nums[nums.length - 1] - cnt + 1) +
                    '-' +
                    '>' +
                    nums[nums.length - 1];

            res.add(sb);
        }

        return res;
    }
}
