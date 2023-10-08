package leetcode_problems.string;

public class _1071_gcdOfStrings {
    public static void main(String[] args) {
        String word1 = "LEET";
        String word2 = "CODE";

        System.out.println(gcdOfStrings(word1, word2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String key = str1.startsWith(str2) ? str2 : str2.startsWith(str1) ? str1 : "";

        if (key.equals("")) return "";
        int gcd = gcd(str1.length(), str2.length());

        key = str1.substring(0, gcd);

        StringBuilder sb = new StringBuilder();
        int len = Math.max(str1.length(), str2.length());
        while (sb.length() < len) {
            sb.append(key);
        }

        if (sb.toString().equals(str1) || sb.toString().equals(str2)) return key;

        return "";
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}