package leetcode_problems;

import java.util.*;

public class _2352_EqualPairs {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 1, 2, 2},
                {1, 4, 4, 4},
                {2, 4, 2, 2},
                {2, 5, 2, 2}
//                {3, 1, 2, 2},
//                {1, 4, 4, 5},
//                {2, 4, 2, 2},
//                {2, 4, 2, 2}
        };

        System.out.println(equalPairs(mat));
    }

    public static int equalPairs(int[][] grid) {
        int count = 0;
        int len = grid.length;
        int[] column = new int[len];
        for (int j = 0; j < len; ++j) {
            for (int i = 0; i < len; ++i) {
                column[i] = grid[i][j];
            }
            for (int[] row : grid) {
                if (Arrays.equals(row, column)) ++count;
            }
        }

        return count;
    }
}
