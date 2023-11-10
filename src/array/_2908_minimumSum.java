package array;

public class _2908_minimumSum {
    public static void main(String[] args) {

    }

    public static int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        if (nums[i] + nums[j] + nums[k] < min) {
                            min = nums[i] + nums[j] + nums[k];
                        }
                    }
                }
            }
        }

        return min;
    }
}
