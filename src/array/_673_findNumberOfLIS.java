package array;

public class _673_findNumberOfLIS {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2};

        System.out.println(findNumberOfLIS(nums));
    }

    public static int findNumberOfLIS(int[] nums) {
        int prev = nums[0];
        int count = 0;
        boolean isInc = false;

        for(int i : nums) {
            //System.out.println(prev + " " + i + " " + count);
            if(prev >= i) {
                ++count;
                isInc = false;
            }
            else {
                isInc = true;
            }

            prev = i;
        }

        if(isInc) ++count;

        return count;
    }
}
