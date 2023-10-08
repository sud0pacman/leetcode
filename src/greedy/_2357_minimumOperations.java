package greedy;

import java.util.HashSet;
import java.util.Set;

public class _2357_minimumOperations {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        byte[] used = new byte[101];

        for (int a : nums) {
            used[a]++;
        }

        byte count = 0;

        for (byte a : used) {
            if (a > 0) {
                ++count;
            }
        }
        count = used[0] > 0 ? (byte) (count - 1) : count;

        return count;
    }
}
