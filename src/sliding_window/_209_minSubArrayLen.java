package sliding_window;

public class _209_minSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLen(target, nums));
    }
    // 2 3 1 2 4 3
    //           ^
    //         ^

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = nums.length+1;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum > target) {
                sum -= nums[start];
                ++start;
            }

            min = Math.min(min, (i - start) + 1);
        }


        return min == nums.length+1 ? -1 : min;
    }
}