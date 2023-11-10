package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2094_findEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 0};
        System.out.println(Arrays.toString(findEvenNumbers(digits)));
    }

    public static int[] findEvenNumbers(int[] digits) {
        int[] dp = new int[10];
        for (int i : digits) {
            ++dp[i];
        }

        List<Integer> ls = new ArrayList<>();
        boolean isAdd;

        for (int i = 100; i < 1000; i++) {
            if (i%2 != 0) continue;

            int[] temp = new int[10];
            ++temp[i/100];
            ++temp[(i/10) % 10];
            ++temp[i%10];


            isAdd = true;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] > dp[j]) {
                    j = temp.length;
                    isAdd = false;
                }
            }

            if (isAdd) ls.add(i);
        }

        int[] res = new int[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            res[i] = ls.get(i);
        }

        return res;
    }
}
