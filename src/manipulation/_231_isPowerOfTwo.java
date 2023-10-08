package leetcode_problems.manipulation;

public class _231_isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }

    static boolean isPowerOfTwo(int n) {
        if(n == 0)return false;
        if(n == 1) return true;

        if(n % 2 != 0) return false;
        else return isPowerOfTwo(n/2);
    }
}