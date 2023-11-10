package stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2216_minDeletion {
    public static void main(String[] args) {
        int lowLimit = 11, highLimit = 104;
        int[] sums = new int[highLimit+1];

        for (int i = lowLimit; i <= highLimit; ++i) {
            int sum = getSum(i);
            ++sums[sum];
        }

        int max = 0;
        for (int sum : sums) {
            if (sum > max) max = sum;
        }
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static int minDeletion(int[] nums) {
        int count = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i] + " " + nums[i + 1]);
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                --len;
                nums[nums.length - 1] = 0;
                ++i;
            }
        }

        System.out.println(Arrays.toString(nums));

        return count;
    }
}