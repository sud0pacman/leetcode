package leetcode_problems.string;

import java.util.Arrays;

public class _2283_digitCount {
    public static void main(String[] args) {
        String num = "030";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        int[] digits = new int[10];

        for (char c : num.toCharArray()) {
            digits[c-48]++;
        }

        for (int i = 0; i < digits.length; i++) {
//            if (i != num[i])
        }

        System.out.println(Arrays.toString(digits));


        return false;
    }
}
