package leetcode_problems.greedy;

import java.util.Arrays;

public class _561_arrayPairSum {
    public static void main(String[] args) {
        int[] arr = {6214, -2290, 2833, -7908};
        System.out.println(arrayPairSum(arr));
    }

    public static int arrayPairSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int[] map = new int[max - min + 1];
        for (int i : nums) {
            map[i - min]++;
        }

        System.out.println(Arrays.toString(map));
        int sum = 0;
        for (int i = 0; i < map.length; i++) {

            if (map[i] > 0) {
                while (map[i] > 0) {
                    sum += (i + min);
                    map[i] -= 2;
                }

                if (map[i] < 0) {
                    while (true) {
                        if (map[++i] != 0) {
                            map[i]--;
                            i--;
                            break;
                        }
                    }
                }
            }
        }

        return sum;
    }
}
