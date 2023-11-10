package string;

public class _1844_replaceDigits {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        char[] ar = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char prev = 'a';

        for (char c : ar) {
            if ('0' <= c && c <= '9') {
                sb.append(shift(prev, c-'0'));
            }
            else sb.append(c);
            prev = c;
        }

        return sb.toString();
    }

    public static char shift(char c, int num) {
        return (char) (c+num);
    }
}
