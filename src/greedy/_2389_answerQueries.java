package greedy;

import java.util.Arrays;

public class _2389_answerQueries {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};

        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        for (int i = 0; i < queries.length; i++) {
            if (nums[0] > queries[i]) {
                queries[i] = 0;
                continue;
            }

            int l = 0, r = nums.length-1, m;

            while (l < r) {
                m = l + (r-l + 1) / 2;

                if (nums[m] > queries[i]) {
                    r = m-1;
                }
                else {
                    l = m;
                }
            }

            queries[i] = l+1;
        }

        return queries;
    }
}
