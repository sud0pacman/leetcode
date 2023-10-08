package leetcode_problems.matrix;

import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
        };

        System.out.println(spiralOrder(mat));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;

        if (col == 1 || row == 1) {
            return isArr(matrix);
        }

        List<Integer> sprMat = new ArrayList<>();

        int last = lastFinder(matrix);
        System.out.println(last);
        int k = 0;

        for (int i = 0; i < matrix.length / 2 + 1; i++) {
            //➡️
            for (int j = i; j < row - i; j++) {
                sprMat.add(matrix[i][j]);
                k = j;
            }
            if (matrix[i][k] == last) break;

            //⬇️

            for (int j = i + 1; j < col - i-1; j++) {
                sprMat.add(matrix[j][row - 1 - i]);
                k = j;
            }
            if (col > 2 && matrix[k][row-1-i] == last) break;


            //⬅️
            for (int j = row-1-i; j >= i; j--) {
                sprMat.add(matrix[col-1-i][j]);
                k = j;
            }
            if (matrix[col-1-i][k] == last) break;

            //⬆️
            for (int j = col-2-i; j > i; j--) {
                sprMat.add(matrix[j][i]);
            }
        }
        return sprMat;
    }

    private static int lastFinder(int[][] mat) {
        int row = mat[0].length;
        int col = mat.length;

        int last = 0;

        if (col == 2|| row == 2) {
            last = mat[1][0];
            return last;
        } else if (col == 3 && row > 2) {
            last = mat[1][row-2];
        } else if (row % 2 != 0 && col % 2 == 0 && row < col) {
            last = mat[col/2][row/2];
            return last;
        }
        else if (row % 2 != 0 && col % 2 == 0) {
            last = mat[row/2][(col/2)-1];
        }
        else if (row % 2 != 0 && col % 2 != 0 && row < col) {
            last = mat[(col/2)+1][row/2];
            return last;
        }
        else if (row % 2 == 0 && col % 2 != 0 && row < col) {
            last = mat[col/2][(row/2)-1];
            return last;
        }
        else if (row % 2 == 0 && col % 2 != 0) {
            last = mat[col/2][row/2];
            return last;
        }
        else if (row == col && col % 2 == 0) {
            last = mat[col/2][(row/2)-1];
            return last;
        }
        else if (row == col) {
            last = mat[row/2][col/2];
            return last;
        }

        return last;
    }

    private static List<Integer> isArr(int[][] mat) {
        List<Integer> sprMat = new ArrayList<>();
        for (int[] ints : mat) {
            for (int i : ints) {
                sprMat.add(i);
            }
        }

        return sprMat;
    }
}
