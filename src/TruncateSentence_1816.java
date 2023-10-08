package leetcode_problems;

public class TruncateSentence_1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (c == ' ') --k;

            if (k == 0) break;
            else sb.append(c);
        }

        return sb.toString();
    }
}
