package leetcode_problems;

public class _2413_smallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }

    public static int smallestEvenMultiple(int n) {
        int i = n;

        while(true) {
            if (i % n == 0 && i % 2 == 0) {
                return i;
            }
            ++i;
        }
    }
}
