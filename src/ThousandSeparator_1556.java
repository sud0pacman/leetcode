package leetcode_problems;

public class ThousandSeparator_1556 {
    public static void main(String[] args) {
        System.out.println(thousandSeparator(1));
    }

    public static String thousandSeparator(int n) {
        StringBuilder num = new StringBuilder();
        int c= 0;

        while (n > 0) {
            if (c == 3) {
                num.append(".");
                c = 0;
            }
            num.append(n%10);

            n /= 10;
            ++c;
        }

        return num.reverse().toString();
    }
}
