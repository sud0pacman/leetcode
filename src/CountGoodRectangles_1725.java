package leetcode_problems;

public class CountGoodRectangles_1725 {
    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};

        System.out.println(countGoodRectangles(rectangles));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int count = 0, min, max = 0, i;

        for (i = 0; i < rectangles.length; i++) {
            min = Math.min(rectangles[i][0], rectangles[i][1]);

            if (min > max) {
                max = min;
                count = 1;
            } else if (min == max) {
                ++count;
            }
        }

        return count;
    }
}