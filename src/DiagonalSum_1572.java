package leetcode_problems;
public class DiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;

        for(int i = 0; i < len; i++) {
            sum += mat[i][i];
        }

        for(int j = len-1; j >= 0; j--) {
            sum += mat[len-j-1][j];
        }

        sum = len%2 != 0 ? sum-mat[len/2][len/2] : sum;

        return sum;
    }
}