package leetcode_problems.matrix;

import java.util.Arrays;

public class _59_SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(4)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int size = mat.length;
        int k = 0;

        for (int i = 0; i < size / 2 + 1; i++) {
            // right
            for (int j = i; j < size - i; j++) {
                mat[i][j] = ++k;
            }

            // bottom
            for (int j = i + 1; j < size - i; j++) {
                mat[j][size - i - 1] = ++k;
            }

            // left
            for (int j = size - 2 - i; j >= i; j--) {
                mat[n - i - 1][j] = ++k;
            }

            // top
            for (int j = n - i - 2; j > i; j--) {
                mat[j][i] = ++k;
            }
        }

        for (int[] ints : mat) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        return mat;
    }
}
