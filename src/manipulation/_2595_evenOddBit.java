package manipulation;

public class _2595_evenOddBit {
    public static void main(String[] args) {
        System.out.println(5 ^ 7);
        System.out.println(decToBin(7));
    }

    public static int[] evenOddBit(int n) {
        StringBuilder bin = decToBin(n);
        int even = 0;
        int odd = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == 1) {
                if (i % 2 == 0) ++even;
                else ++odd;
            }
        }

        return new int[]{even, odd};
    }

    public static StringBuilder decToBin(int decimal) {
        if (decimal == 0) {
            return new StringBuilder("0");
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal = decimal / 2;
        }

        return binary.reverse();
    }

    //  &
    // 0101
    // 0111
    //  101

    // |
    // 101
    // 111
    //
}
