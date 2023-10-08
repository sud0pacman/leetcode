package leetcode_problems.array;

public class _53_MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int size = nums.length;
        int res = Integer.MIN_VALUE, endHere = 0;

        for (int i = 0; i < size; i++) {
            endHere = endHere + nums[i];

            if (res < endHere) {
                res = endHere;
            }
            if (endHere < 0) {
                endHere = 0;
            }
        }


        return res;

        // int size = nums.length;
        //        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        //
        //        for (int i = 0; i < size; i++) {
        //            max_ending_here = max_ending_here + nums[i];
        //            if (max_so_far < max_ending_here)
        //                max_so_far = max_ending_here;
        //            if (max_ending_here < 0)
        //                max_ending_here = 0;
        //        }
        //
        //        return max_so_far;
    }
}
