package leetcode_problems;

public class MultiplyStrings_43 {
    public static void main(String[] args) {
        String n1 = "19";
        String n2 = "1";

        System.out.println(multiply(n1, n2));
    }

    public static String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        int sum;

        while (i >= 0 || j >= 0) {
            sum = carry;

            if (i >= 0) sum += (num1.charAt(i--) - '0'); //
            if (j >= 0) sum += (num2.charAt(j--) - '0');

            sb.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
