package leetcode_problems.math;

public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(6900));
    }

    public static int maximum69Number (int num) {
        int degree = (int) Math.log10(num);
        int ten = (int) Math.pow(10, degree);

        while (ten != 0) {
            if ((num / ten) % 10 == 6) {
                break;
            }
            ten /= 10;
        }

        if (ten == 0) return num;

        num = ((num / (ten*10)) * 10 + 9) * ten + (num%ten);

        return num;
    }
}
