package leetcode_problems.sliding_window;

public class _1456_maxVowels {
    public static void main(String[] args) {
        String s = "aeiou";
        int k =2;
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k) {
        int count = 0;
        int length = s.length();
        if (k > length) return 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) count++;
        }

        int maxCount = count;
        for (int i = k; i < length; i++) {
            char prevC = s.charAt(i - k), currC = s.charAt(i);
            if (isVowel(prevC)) count--;
            if (isVowel(currC)) count++;

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}