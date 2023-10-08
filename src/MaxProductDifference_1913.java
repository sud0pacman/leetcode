package leetcode_problems;

public class MaxProductDifference_1913 {
    public static void main(String[] args) {
        int[] arr = {5,6,2,7, 4};

        System.out.println(maxProductDifference(arr));
    }

    public static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i : nums) {
            if(i > max1) {
                max2 = max1;
                max1 = i;
            } else if(i > max2) {
                max2 = i;
            }

            if(i < min1) {
                min2 = min1;
                min1 = i;
            } else if(i < min2) min2 = i;
        }

        return (max1*max2)-(min1 * min2);
    }
}
