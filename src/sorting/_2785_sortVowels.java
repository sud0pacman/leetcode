package sorting;

public class _2785_sortVowels {
    public static void main(String[] args) {
        String s = "qUSUCJeJZt";  // qUSUCJeJZt

        System.out.println(sortVowels(s));
    }

    public static String sortVowels(String s) {
        int[] dp = new int[123];
        char[] ss = s.toCharArray();

        for (char c : ss) {
            ++dp[c];
        }

        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i < dp.length; i++) {
            if (isVowel((char) i)) {
                int c = dp[i];
                while (c > 0) {
                    vowels.append((char) i);
                    --c;
                }
            }
        }

        int index = 0;

        for (int i = 0; i < ss.length; i++) {
            if (isVowel(ss[i]) && index < vowels.length()) {
                ss[i] = vowels.charAt(index);
                ++index;
            }
        }

        return new String(ss);
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
