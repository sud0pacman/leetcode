package leetcode_problems.hash_table;

public class _2475_unequalTriplets {
    public static void main(String[] args) {
    }

    public static int unequalTriplets(int[] nums) {
        int[] count = new int[1001];

        for(int i = 0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int left = 0;
        int right = nums.length;
        int res= 0 ;
        for (int freq : count) {
            if (freq != 0) {
                right = right - freq;
                res += left * freq * right;
                left += freq;
            }
        }

        return res;
    }
}
