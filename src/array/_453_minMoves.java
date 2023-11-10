package array;

public class _453_minMoves {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2,1};
        System.out.println(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        int count = 0;
        int standard = Integer.MAX_VALUE;

        for (int num : nums) {
            if (standard > num) standard = num;
        }

        for (int num : nums) {
            if (standard < num) {
                count += num - standard;
            } else {
                count += standard - num;
            }
        }

        return count;
    }
}
