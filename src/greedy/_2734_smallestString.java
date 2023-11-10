package greedy;

public class _2734_smallestString {
    public static void main(String[] args) {
        String s = "acbbc";
        System.out.println(smallestString(s));
    }

    public static String smallestString(String s) {
        char[] chars = s.toCharArray();
        int n = s.length(), i = 0;

        while (i < n && s.charAt(i) == 'a') i++;

        boolean replace = false;
        for (; i < n; i++) {
            if (chars[i] == 'a') {
                if (replace) {
                    break;
                }
                continue;
            }

            replace = true;
            chars[i] = (char) (chars[i] - 1);
        }

        if (!replace) {
            chars[n - 1] = 'z';
        }

        return new String(chars);
    }
}
