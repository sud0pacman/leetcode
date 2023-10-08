package leetcode_problems.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2038_winnerOfGame {
    public static void main(String[] args) {
        String colors = "ABBBBBBBAAA";
        System.out.println(winnerOfGame(colors));
    }

    public static boolean winnerOfGame(String colors) {
        int[] ab = new int[67];
        char[] arr = colors.toCharArray();
        char x;
        int count;


        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            count = 0;

            while (i < arr.length && arr[i] == x) {
                ++i;
                ++count;
            }

            ab[x] += Math.max(count - 2, 0);
            --i;
        }

        return ab[65] > ab[66];
    }
}
