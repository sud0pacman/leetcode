package leetcode_problems;

public class _125_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] chars = s.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) sb.append(chars[i]);
        }

        return sb.toString().contentEquals(sb.reverse());
    }
}
