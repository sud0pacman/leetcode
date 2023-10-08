package leetcode_problems;

import java.util.Scanner;

public class Fibonaci_509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n == 0) return n;
        else if (n == 1) return n;

        int f1 = 0, f2 = 1;

        for (int i = 2; i <= n; i++) { // 2 3 4
            int fn = f2;               // fn = 1      1     2
            f2 = f1+f2;                // f2 = 0+1  1+1   1+2
            f1 = fn;                   // f1 = 1     1     2
        }

        return f2;
    }
}
