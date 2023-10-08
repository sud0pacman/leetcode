package leetcode_problems;

public class _258_AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(101));
    }

    public static int addDigits(int num) {
        if (num % 100 == 0 && num != 0) return 1;
        int sum = num;

        while(sum >= 10) {
            sum = Summer(sum);
        }

        return sum;
    }

    public static int Summer(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }
}
