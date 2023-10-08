package leetcode_problems;

public class PrefixCount_2185 {
    public static void main(String[] args) {
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) ++count;
        }

        return count;
    }
}
