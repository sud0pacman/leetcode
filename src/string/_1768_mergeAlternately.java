package leetcode_problems.string;

public class _1768_mergeAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int len = word1.length() + word2.length();
        int i, j;
        char[] arr = new char[len];

        if (word1.length() < word2.length()) {
            j = 0;
            for (i = 0; i < word1.length(); i++) {
                arr[j] = word1.charAt(i);
                arr[j+1] = word2.charAt(i);
                j+=2;
            }

            while (j < len) {
                arr[j++] = word2.charAt(i++);
            }
        }
        else {
            j = 0;

            for (i = 0; i < word2.length(); i++) {
                arr[j] = word1.charAt(i);
                arr[j+1] = word2.charAt(i);
                j+=2;
            }

            while (j < len) {
                arr[j++] = word1.charAt(i++);
            }
        }
        return new String(arr);
    }
}
