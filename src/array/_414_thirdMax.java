package leetcode_problems.array;

public class _414_thirdMax {
    public static void main(String[] args) {
        int[] test1 = {3, 2, 1}; // 1
        int[] test2 = {1, 1, 2};  // 2
        int[] test3 = {1, 2, 2};  // 2
        int[] test4 = {1, 2, 2, 5, 3, 5}; // 2
        int[] test5 = {1, 2, -2147483648}; // -2147483648
        int[] test6 = {-2147483648, 1, 2}; // -2147483648
        int[] test7 = {5,2,2};  // 5
        int[] test8 = {-2147483648,1,1};  // 1
        int[] test9 = {3,3,3,3,4,3,2,3,3}; // 2

        System.out.println(thirdMax(test1));
        System.out.println(thirdMax(test2));
        System.out.println(thirdMax(test3));
        System.out.println(thirdMax(test4));
        System.out.println(thirdMax(test5));
        System.out.println(thirdMax(test6));
        System.out.println(thirdMax(test7));
        System.out.println(thirdMax(test8));
        System.out.println(thirdMax(test9));
    }

    public static int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean isHave = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max1 && max1 != Integer.MIN_VALUE) continue;
            else if (nums[i] == max2 && max2 != Integer.MIN_VALUE) continue;
            else if (nums[i] == max3 && max3 != Integer.MIN_VALUE) continue;

            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] >= max3) {
                max3 = nums[i];
                isHave = true;
            }
        }

        if (max3 == max2) return max1;
        if (isHave && max3 == Integer.MIN_VALUE) return max3;
        if (max3 == Integer.MIN_VALUE) return max1;

        return max3;
    }
}
