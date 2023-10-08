package leetcode_problems;

public class _1929_getConcatenation {
    public static void main(String[] args) {
    }

    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
            nums2[nums.length+i] = nums[i];
        }

        return nums2;
    }
}
