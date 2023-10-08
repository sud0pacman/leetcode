package leetcode_problems.math;

import java.util.Arrays;

public class _492_constructRectangle {
    public static void main(String[] args) {
        int area = 37;
        System.out.println(Arrays.toString(constructRectangle(area)));
    }

    public static int[] constructRectangle(int area) {
        for (int i = (int) Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                return new int[]{area / i, i};
            }
        }

        return new int[]{area, 1};
    }
}