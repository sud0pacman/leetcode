package leetcode_problems.math;

public class _263_IsUgly {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isUgly(n));
    }

    public static boolean isUgly(int n) {
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else if (n % 3 == 0) n /= 3;
            else if (n % 5 == 0) n /= 5;
            else return false;

            System.out.println(n);
        }

        return true;
    }
}
