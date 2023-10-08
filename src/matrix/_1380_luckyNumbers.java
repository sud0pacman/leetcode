package leetcode_problems.matrix;

import java.util.ArrayList;
import java.util.List;

public class _1380_luckyNumbers {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 7, 8},
                {15, 16, 17}
        };

        System.out.println(luckyNumbers(mat));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minCol = minColInRow(matrix, i);
            for (int j = 0; j < matrix[i].length; j++) {
                if (isMaxInCol(matrix, j, minCol))
                    ls.add(matrix[i][j]);
            }
        }

        return ls;
    }

    public static int minColInRow(int[][] mat, int row) {
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < mat[row].length; j++) {
            if (mat[row][j] < min)
                min = mat[row][j];
        }

        return min;
    }

    public static boolean isMaxInCol(int[][] mat, int col, int value) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > value) {
                return false;
            }
        }

        return true;
    }
}
