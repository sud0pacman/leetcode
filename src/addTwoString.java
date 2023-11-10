public class addTwoString {
    public static void main(String[] args) {
        String s1 = "999";
        String s2 = "9";

        System.out.println(add(s1, s2));
    }

    public static String add(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1;
        int carry = 0;
        int sum;

        while (i >= 0 || j >= 0) {
            sum = carry;

            if (i >= 0) sum += s1.charAt(i) - '0';
            if (j >= 0) sum += s2.charAt(j) - '0';

            sb.append(sum % 10);
            carry = sum / 10;
            --i;
            --j;
        }

        if (carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }
}