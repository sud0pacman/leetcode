package leetcode_problems.array;

public class _1822_arraySign {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
    }

    public static int arraySign(int[] nums) {
        int negNum = 0;
        int posNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negNum++;
            } else if (nums[i] == 0) {
                return 0;
            }
            else ++posNum;
        }

        return negNum > posNum ? -1 : 1;
    }
}
