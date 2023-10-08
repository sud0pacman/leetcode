package leetcode_problems.bineary_search;

public class IsPerfectSquare {
    public static void main(String[] args) {
        int n = 16;

        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) square(num);

        return sqrt * sqrt == num;
    }

    public static double square(double number){
        double t;

        double squareroot = number / 2;

        do {
            t = squareroot; // 8 5 4
            squareroot = (t + (number / t)) / 2;
        } while ((t - squareroot) != 0);

        return squareroot;
    }
}
