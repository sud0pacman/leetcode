package leetcode_problems;

import java.util.Arrays;

public class _2559_VowelStrings {
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2}, {1,4}, {1,1}};

        System.out.println(Arrays.toString(vowelStrings(words, queries)));
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] acpt = new int[words.length];
        for(int i=0; i<words.length; i++)   acpt[i] = checkWords(words[i]);
        for(int i=1; i<words.length; i++)   acpt[i] += acpt[i-1];

        int[] res = new int[queries.length];
        int value;
        for(int i=0; i<queries.length; i++) {
            value = acpt[queries[i][1]] - (queries[i][0] == 0 ? 0 : acpt[queries[i][0] - 1]);
            System.out.println(acpt[queries[i][1]]);
            res[i] = value;
        }
        return res;
    }

    public static String v = "aeiou";
    public static int checkWords(String word) {
        return v.contains(String.valueOf(word.charAt(0))) && v.contains(String.valueOf(word.charAt(word.length() - 1))) ? 1 : 0;
    }
}
