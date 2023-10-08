package leetcode_problems;

import java.util.Scanner;

public class TribonacciNumbers_1137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(tribonacci(n));
    }

    public static int tribonacci(int n) {
        int t0 = 0, t1 = 1, t2 = 1;

        for (int i = 3; i <= n; i++) {
            int tn = t2;
            t2 = t0+t1+t2;
            t0 = t1;
            t1 = tn;
        }

        return t2;
    }
}
