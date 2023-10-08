package leetcode_problems;

import java.util.Scanner;

public class _70_climStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) { // 2  3  4  5  6
            int temp = curr;           // 1  2  3  5  8
            curr = prev + curr;        // curr = 1+1  1+2  2+3  3+5  5+8
            prev = temp;               // prev = 1    2    3    5    13
        }
        return curr;
    }
}
