package leetcode_problems;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class _2553_SeparateDigits {
    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};

        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }

        int length = sb.length();

        int[] answers = new int[length];
        int index = length-1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (num > 0) {
                answers[index--] = num % 10;
                num /= 10;
            }
        }

        return answers;
    }
}
