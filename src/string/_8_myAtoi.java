package string;

public class _8_myAtoi {
    public static void main(String[] args) {
        String t1 = "  3.14159   ";
        String t2 = "+-12";
        String t3 = "   -42";
        String t4 = "21474836460";
        System.out.println(myAtoi(t3));
    }

    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') i++;

        int positive = 0, negative = 0;

        if (i < n && s.charAt(i) == '+') {
            positive++;
            i++;
        }

        if (i < n && s.charAt(i) == '-') {
            negative++;
            i++;
        }

        if (positive > 0 && negative > 0) return 0;

        int sign = negative > 0 ? -1 : 1;

        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        long ans = 0;
        char[] ar = s.toCharArray();

        ++i;
        for (; i < n && ar[i] >= '0' && ar[i] <= '9'; i++) {
            ans = ans * 10 + (s.charAt(i) - '0');

            if (ans * sign >= INT_MAX) {
                ans = INT_MAX;
                break;
            }

            if (ans * sign <= INT_MIN) {
                ans = INT_MIN;
                break;
            }
        }

        return (int) ans * sign;
    }
}