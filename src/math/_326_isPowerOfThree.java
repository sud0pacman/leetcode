package leetcode_problems.math;

public class _326_isPowerOfThree {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n % 3 == 0 && n > 1) return isPowerOfThree(n/3);
        else return n == 1;

    }
}
