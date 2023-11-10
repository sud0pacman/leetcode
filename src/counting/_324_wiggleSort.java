package counting;

import java.util.Arrays;

public class _324_wiggleSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 3, 1};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void wiggleSort(int[] nums) {
        int[] bucket = new int[5001];

        for (int i : nums)
            bucket[i]++;

        int max = 5000;
        boolean firstPass = true;
        for (int i = 1; i < nums.length; i += 2) {

            while (bucket[max] == 0)
                max--;// find last

            nums[i] = max;
            bucket[max]--;


            if (firstPass && i + 2 >= nums.length) {
                System.out.println(i);
                i = -2; // fills all odd indices so we 2 minus from i and i = -1, for(i += 2) i = 0
                firstPass = false;
            }
        }
    }
}
