package leetcode_problems;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int square(int n) {
        int sum = 0;

        while (n > 0) {
            sum += (int) Math.pow(n%10, 2);
            n /= 10;
        }

        return sum;
    }
}
