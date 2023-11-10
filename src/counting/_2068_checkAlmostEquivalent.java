package counting;

public class _2068_checkAlmostEquivalent {
    public static void main(String[] args) {
        String word1 = "aaaa", word2 = "bccb";

        System.out.println(checkAlmostEquivalent(word1, word2));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[123];
        int[] freq2 = new int[123];

        for (int i = 0; i < word1.length(); i++) {
            ++freq1[word1.charAt(i)];
            ++freq2[word2.charAt(i)];
        }

        for (int i = 97; i < 123; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > 3) {
                return false;
            }
        }

        return true;
    }
}
