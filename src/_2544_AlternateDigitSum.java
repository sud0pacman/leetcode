package leetcode_problems;

public class _2544_AlternateDigitSum {
    public static void main(String[] args) {
        int n = 521;
        System.out.println(alternateDigitSum(n));
    }

    public static int alternateDigitSum(int n) {
        int sum = 0;
        int d = (int) Math.pow(10, (int) (Math.log10(n)));
        int i = 0;

        while (d > 0) {
            if (i % 2 == 0) sum += n / d % 10;
            else sum -= n / d % 10;

            ++i;
            d /= 10;
        }

        return sum;
    }
}
