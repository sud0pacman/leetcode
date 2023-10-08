package leetcode_problems;

import java.util.Arrays;

public class ShuffleString_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] word = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            word[indices[i]] = s.charAt(i);
        }

        StringBuilder sBuilder = new StringBuilder();
        for (char c : word) {
            sBuilder.append(c);
        }
        s = sBuilder.toString();

        return s;
    }
}
