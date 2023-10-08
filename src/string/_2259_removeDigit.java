package leetcode_problems.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2259_removeDigit {
    public static void main(String[] args) {
        String number = "743";
        char digit = '7';

        System.out.println(removeDigit(number, digit));
    }

    public static String removeDigit(String number, char digit) {
        int index = 0, n = number.length();

        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                index = i;
                if (i < n - 1 && digit < number.charAt(i + 1)) break;
            }
        }

        number = number.substring(0, index) + number.substring(index + 1);
        return number;
    }
}
