package math;

import java.util.List;

public class _2221_triangularSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(nums,1));
    }

    public static int triangularSum(int[] nums) {
        int n = nums.length;

        while (--n > 0) {
            for (int i = 0; i < n; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        return nums[n];
    }

    public static int triangularSum(int[] nums,int a) {
        int result = 0;
        int m = nums.length - 1;
        int mCk = 1;
        for (int k = 0; k <= m; k++) {
            result = (result + mCk * nums[k]) % 10;
            mCk *= m - k;
            mCk /= k + 1;
        }
        return result;//4
    }
}
