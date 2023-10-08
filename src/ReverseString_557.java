package leetcode_problems;

public class ReverseString_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int l = 0;
        int r = 0;
        char[] a = s.toCharArray();
        while (l < s.length()) {
            while (r < s.length() && a[r] != ' ') {
                r++;
            }

            reverse(a, l, r - 1);
            ++r;
            l = r;
        }
        return String.valueOf(a);
    }

    public static void reverse(char[] s, int l, int r) {
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
