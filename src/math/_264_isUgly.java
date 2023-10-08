package leetcode_problems.math;

import java.util.Arrays;

public class _264_isUgly {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }

    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        int min;

        for (int i = 1; i < n; i++) {
            min = min(factor2, min(factor3, factor5));
            ugly[i] = min;

            if (factor2 == min) factor2 = 2*ugly[++index2];

            if (factor3 == min) factor3 = 3*ugly[++index3];

            if (factor5 == min) factor5 = 5*ugly[++index5];
        }

        System.out.println(Arrays.toString(ugly));

        return ugly[n-1];
    }

    public static int min(int a, int b) {
        return a <= b ? a : b;
    }
}
