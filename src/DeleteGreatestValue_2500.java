package leetcode_problems;

import java.util.Arrays;

public class DeleteGreatestValue_2500 {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 4},
                {3, 3, 1}
        };

        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int[] rowMax = new int[grid.length];
        Arrays.fill(rowMax, Integer.MIN_VALUE);
        int ans = 0;
        int w = grid[0].length;

        while (w > 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    rowMax[i] = Math.max(grid[i][j], rowMax[i]);
                }
            }

            ans = ans + Arrays.stream(rowMax).max().getAsInt();

            // delete max
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == rowMax[i]) {
                        grid[i][j] = Integer.MIN_VALUE;
                        rowMax[i] = Integer.MIN_VALUE;
                    }
                }
            }
            w--;
        }

        return ans;
    }
}
