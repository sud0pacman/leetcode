package leetcode_problems;

public class IsPrefixString_1961 {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};

        System.out.println(isPrefixString(s, words));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        int sl = s.length();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);

            if (sb.length() == sl) break;
            else if (sb.length() > sl) return false;
        }

        return sb.toString().equals(s);
    }
}
