package greedy;

import java.util.Arrays;

public class _976_largestPerimeter {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length-1; i > 2; --i) {
            if(nums[i-2] + nums[i-1] > nums[i]) {
                return nums[i-2] + nums[i-1] + nums[i];
            }
        }

        return 0;
    }
}
