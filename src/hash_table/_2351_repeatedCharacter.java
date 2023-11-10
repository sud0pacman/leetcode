package hash_table;

public class _2351_repeatedCharacter {
    public static void main(String[] args) {

    }

    public static char repeatedCharacter(String s) {
        int[] count = new int[123];

        for (char c : s.toCharArray()) {
            if (count[c] == 1) return c;
            ++count[c];
        }

        for (int i = 97; i < 123; i++) {
            if (count[i] == 2) return (char) i;
        }

        return ' ';
    }
}