package leetcode_problems;

public class FreqAlphabets_1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int num, i = 0;

        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                i += 3;
            } else {
                num = s.charAt(i) - '0';
                ++i;
            }

            sb.append((char) ('a' + num - 1));
        }

        return sb.toString();
    }
}
