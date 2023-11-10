package math;

import java.util.Arrays;

public class _1201_nthUglyNumber {
    public static void main(String[] args) {
        int n = 3, a = 2, b = 3, c = 5;
        System.out.println(nthUglyNumber(n, a, b, c));
    }

    public static int nthUglyNumber(int n, int a, int b, int c) {
        int[] uglies = new int[n];
        int factorA = a, factorB = b, factorC = c;
        int aIndex = 0, bIndex = 0, cIndex = 0;
        int min;

        for (int i = 0; i < n; i++) {
            min = min(factorA, min(factorB, factorC));
            uglies[i] = min;

            if (min == factorA) factorA = a * uglies[aIndex++];

            if (min == factorB) factorB = b * uglies[bIndex++];

            if (min == factorC) factorC = c * uglies[cIndex++];
        }

        System.out.println(Arrays.toString(uglies));

        return uglies[n-1];
    }

    public static int min(int a, int b) {
        return a <= b ? a : b;
    }
}
