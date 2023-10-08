package leetcode_problems.hash_table;

import java.util.HashMap;
import java.util.Map;

public class _792_numMatchingSubseq {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};

        System.out.println(numMatchingSubseq(s, words));
    }
    public static int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0)+1);
        }

        int len = s.length();
        int ans = 0;

        for (String w : hm.keySet()) {
            int i = 0;
            int j = 0;

            while (i < w.length() && j < len) {
                if (w.charAt(i) == s.charAt(j)) {
                    i = i+1;
                    j = j+1;
                }
                else {
                    i = i+1;
                }
            }

            if (w.length() == j)
                ans = hm.get(w);
        }

        return ans;
    }
}