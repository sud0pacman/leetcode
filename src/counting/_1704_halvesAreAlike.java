package counting;

public class _1704_halvesAreAlike {
    public static void main(String[] args) {
        String s = "AbCdEfGh";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        char[] ss = s.toCharArray();
        int lCount = 0, rCount = 0;
        int mid = ss.length / 2;
        int l = 0, r = ss.length - 1;

        while (l < mid && mid <= r) {
            if (isVowel(ss[l])) ++lCount;
            if (isVowel(ss[r])) ++rCount;

            ++l;
            --r;
        }

        return lCount == rCount;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' ||c == 'I' ||c == 'O' ||c == 'U';
    }
}
