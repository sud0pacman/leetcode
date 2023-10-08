package leetcode_problems.array;

public class _867_transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        matrix = transpose(matrix);

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int[] newmat = new int[matrix.length * matrix[0].length];
        int k = 0;

        for (int i = 0; i < (matrix.length); i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newmat[k++] = matrix[j][i];
            }
        }

        k = 0;

        for (int i = 0; i < (matrix.length); i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = newmat[k++];
            }
        }

        return matrix;
    }
}
