package leetcode_problems;

public class FirstPalindrome_2108 {
    public static void main(String[] args) {
    }

    private static boolean isPalindromic(String currString) {
        int endIndex = currString.length() - 1;
        for (int i = 0; i < endIndex; i++) {
            if (currString.charAt(i) != currString.charAt(endIndex)) {
                return false;
            }
            endIndex -= 1;
        }
        return true;
    }

    public static String firstPalindrome(String[] words) {
        for (String a : words) {
            if (isPalindromic(a)) {
                return a;
            }
        }
        return "";
    }
}
