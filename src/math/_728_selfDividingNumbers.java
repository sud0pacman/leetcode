package leetcode_problems.math;

import java.util.ArrayList;
import java.util.List;

public class _728_selfDividingNumbers {
    public static void main(String[] args) {
        int left = 66, right = 708;

        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) ls.add(i);
        }

        return ls;
    }

    private static boolean selfDividing(int n) {
        int safe = n;
        int digit = n % 10;

        while (n > 0) {
            if (digit == 0) return false;
            if (safe % digit != 0) return false;

            n = n / 10;
            digit = n % 10;
        }

        return true;
    }
}
