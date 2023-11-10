package counting;

import java.util.Arrays;
import java.util.HashMap;

public class _1632_matrixRankTransform {
    public static void main(String[] args) {

    }

    public static int[][] matrixRankTransform(int[][] matrix) {
        int[] sort = new int[matrix.length * matrix[0].length];
        int ind = 0;
        for (int[] ints : matrix) {
            for (int i : ints) {
                sort[ind++] = i;
            }
        }

        Arrays.sort(sort);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < sort.length; i++) {
            if (!map.containsKey(sort[i])) {
                map.put(sort[i], ++count);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = map.get(matrix[i][j]);
            }
        }

        return matrix;
    }
}
