package leetcode_problems;

public class IsPerfectSquare_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(214748364));
    }

    public static boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        System.out.println(n / (int) n);

        return n / (int) n == 1;
    }
}
