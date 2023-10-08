package leetcode_problems;

import java.util.Scanner;

public class _69_Sqrt {
    public static void main(String[] args) {
        System.out.println(Math.log(15));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        x = (int) Math.sqrt(x);
        x = (int) Math.floor(x);
        return x;
    }
}
