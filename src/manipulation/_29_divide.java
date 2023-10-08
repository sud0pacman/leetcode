package leetcode_problems.manipulation;

public class _29_divide {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 2;

        System.out.println(divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = (dividend >= 0) == (divisor >= 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = 0;
        while (dividend - divisor >= 0) {
            int count = 0;
            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }
            result += 1 << count;
            dividend -= divisor << count;
        }
        return sign ? result : -result;
    }
}
