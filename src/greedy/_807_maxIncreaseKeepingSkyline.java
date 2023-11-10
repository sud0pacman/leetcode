package greedy;

public class _807_maxIncreaseKeepingSkyline {
    public static void main(String[] args) {
        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };

        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRows = new int[grid.length];
        int[] maxCol = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            int max = 0;

            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, grid[i][j]);
            }

            maxRows[i] = max;
        }

        for (int i = 0; i < maxCol.length; i++) {
            int max = grid[0][i];

            for (int j = 0; j < maxRows.length; j++) {
                max = Math.max(max, grid[j][i]);
            }

            maxCol[i] = max;
        }

        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += Math.max(
                        Math.min(maxRows[i], maxCol[j])-grid[i][j],
                        0
                );
            }
        }

        return sum;
    }
}