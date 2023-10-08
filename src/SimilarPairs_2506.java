package leetcode_problems;

public class SimilarPairs_2506 {
    public static void main(String[] args) {
        String[] words = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        int ci;
        int cj;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                ci = 0;
                cj = 0;

                // chap so'z o'ng so'zga tekshiriladi
                for (char ch : words[j].toCharArray()) {
                    if (words[i].indexOf(ch) != -1) ++cj;
                    else break;
                }

                // o'ng so'z chap so'zga tekshhiriladi
                for (char ch : words[i].toCharArray()) {
                    if (words[j].indexOf(ch) != -1) ++ci;
                }

                if (ci == words[i].length() && cj == words[j].length()) ++count;
            }
        }

        return count;
    }
}
