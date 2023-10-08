package greedy;

import java.util.Arrays;

public class _2578_splitNum {
    public static void main(String[] args) {
        int num = 4325;
        System.out.println(splitNum(num));
    }

    public static int splitNum(int num) {
        if(num <= 99) return num%10 + (num/10);

        int[] dp = new int[10];
        int n = num;

        while (n > 0) {
            ++dp[n % 10];
            n /= 10;
        }

        int controller = 0;
        int num1 = 0;
        int num2 = 0;

        for (int d = 1; d < 10; d++) {
            if (dp[d] == 0) continue;

            while (dp[d] > 0) {
                if (controller % 2 == 0) num1 = num1*10 + d;
                else num2 = num2*10 + d;

                ++controller;
                --dp[d];
            }
        }

        return num1 + num2;
    }
}
