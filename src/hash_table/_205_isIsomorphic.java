package hash_table;

import java.util.Arrays;

public class _205_isIsomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] s1 = new int[127];
        int[] s2 = new int[127];

        for (int i = 0; i < s.length(); i++) {
            if (s1[s.charAt(i)] != s2[t.charAt(i)]) return false;

            s1[s.charAt(i)]++;
            s2[t.charAt(i)]++;
        }

        return true;
    }
}
