package leetcode_problems.bineary_search;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5}};
        int target = 5;

        System.out.println(searchMatrix(mat, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left, right, mid;
        for (int i = 0; i < matrix.length; i++) {
            left = 0;
            right = matrix[i].length - 1;

            if (matrix[i][right] >= target) {

                while (left <= right) {
                    mid = left + (right - left) / 2;

                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }

        return false;
    }
}
