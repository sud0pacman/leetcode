package leetcode_problems.bineary_search;

public class _441_arrangeCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long mid, sum;
        while (start <= end) {
            mid = (end + start) / 2;
            sum = (mid * (mid + 1)) / 2;

            if (sum == n) return (int) mid;
            else if (sum > n) end = mid - 1;
            else start = mid + 1;
        }

        return (int) end;
    }
}
