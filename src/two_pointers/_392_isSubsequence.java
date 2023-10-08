package leetcode_problems.two_pointers;

public class _392_isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int index;
        for (int j = 0; j < s.length(); j++) {
            index = t.indexOf(s.charAt(j));
            if (index != -1) {
                t = t.substring(index + 1);
                System.out.println(t);
            } else return false;
        }

        return true;
    }
}
