package counting;

public class _2278_percentageLetter {
    public static void main(String[] args) {

    }

    public static int percentageLetter(String s, char letter) {
        int[] count = new int[123];
        char[] ss = s.toCharArray();

        for (char c : ss) {
            ++count[c];
        }

        return count[letter] * 100 / s.length();
    }
}
