package leetcode_problems;

public class _2124_CheckString {
    public static void main(String[] args) {
        String s = "aaabbb";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        char[] chars = s.toCharArray();
        int i;
        for(i = 1; i < chars.length; i++) {
            if(chars[i-1] > chars[i]) return false;
        }

        return true;
    }
}
