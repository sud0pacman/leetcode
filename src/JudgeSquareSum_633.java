package leetcode_problems;

public class JudgeSquareSum_633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(1000));
    }

    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (int) Math.sqrt(c);
        long total;

        while (start <= end) {
            total = (start*start) + (end*end);

            if (c == total) return true;
            else if (total < c) ++start;
            else --end;
        }

        return false;
    }
}
