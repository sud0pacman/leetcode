package leetcode_problems.math;

public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int s1 = (n * (n + 1)) / 2, s2 = n, ans = -1, i;
        for (i = n; i > 0; i--) {
            if (s1 == s2) {
                ans = i;
                break;
            } else {
                s1 = s1 - i;
                s2 = s2 + (i - 1);
            }
        }
        return ans;
    }
}
