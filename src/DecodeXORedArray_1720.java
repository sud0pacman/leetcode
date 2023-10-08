package leetcode_problems;

import java.util.Arrays;

public class DecodeXORedArray_1720 {
    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;

        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        int index= 1;

        for (int i : encoded) {
            first = i ^ first;
            res[index++] = first;
        }

        return res;
    }
}