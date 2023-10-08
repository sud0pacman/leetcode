package leetcode_problems;

public class DetectCapitalUse_520 {
    public static void main(String[] args) {
    }

    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int capCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {

                if (capCount == 0 && i != 0) return false;
                ++capCount;
            }
        }

        return capCount == 1 || capCount == 0 || capCount == chars.length;
    }
}
