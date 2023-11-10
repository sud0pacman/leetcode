package manipulation;

import java.util.Arrays;

public class _137_singleNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] ^ nums[i-1];
        }

        System.out.println(Arrays.toString(res));

        return 0;
    }
}
