package dynamic_programming;

public class _343_integerBreak {
    public static void main(String[] args) {

    }

    public static int integerBreak(int n) {
        if(n == 2 || n == 3) {
            return n-1;
        }

        int res = 1;
        while(n > 4) {
            res *= 3;
            n -= 3;
        }

        return res*n;
    }
}
