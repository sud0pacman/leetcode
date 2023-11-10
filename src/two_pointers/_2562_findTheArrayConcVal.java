package two_pointers;

public class _2562_findTheArrayConcVal {
    public static void main(String[] args) {
        int[] nums = {7, 52, 2, 4};
        System.out.println(findTheArrayConcVal(nums));
    }

    public static long findTheArrayConcVal(int[] nums) {
        int l = 0, r = nums.length - 1;
        int ten;
        long sum = 0;

        while (l < r) {
            ten = (int) Math.pow(10, (int) Math.log10(nums[r]) + 1);
            sum += (long) nums[l] * ten + nums[r];
            ++l;
            --r;
        }

        if (l == r) {
            sum += nums[r];
        }

        return sum;
    }
}
