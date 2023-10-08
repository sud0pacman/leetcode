package leetcode_problems;

public class CountNegatives_1351 {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1,-1,-2,-3}
        };

        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                count += m - row;
                System.out.println(m - row);
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}
