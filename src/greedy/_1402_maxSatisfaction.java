package greedy;

import java.util.Arrays;

public class _1402_maxSatisfaction {
    public static void main(String[] args) {
        int[] nums = {-2,5,-1,0,3,-3};
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i]*i);
        }

        System.out.println(sum);
        //maxSatisfaction(nums);
    }

    public static int maxSatisfaction(int[] satisfaction) {
        System.out.println(Arrays.toString(satisfaction));
        int sum = 0;
        int mul = 1;

        int i = 0;
        for (; i < satisfaction.length-1; ++i) {
            if (sum + satisfaction[i+1] < 0) continue;
            //System.out.println(satisfaction[i]);
            sum += satisfaction[i] * mul;
            ++mul;
        }

        sum = satisfaction[i] < 0 ? sum : sum+satisfaction[i]*mul;

        System.out.println(sum);
        return sum;
    }
}
