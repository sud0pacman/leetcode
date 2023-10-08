package leetcode_problems.hash_table;

public class _1941_areOccurrencesEqual {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        byte[] freq = new byte[26];
        for (char c : s.toCharArray()) {
            freq[c-'a']++;
        }

        int count = freq[s.charAt(0)-'a'];

        for (char c : s.toCharArray()) {
            if (freq[c-'a'] != count) {
                return false;
            }
        }

        return true;
    }
}
