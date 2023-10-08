package leetcode_problems;

public class _1134_ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int n) {
        int len = (int) (Math.log10(n)+1);
        int sum = 0;
        int temp = n;

        while (n > 0) {
            sum += (int) Math.pow(n%10, len);
            n /= 10;
        }

        return temp == sum;
    }
}
