package leetcode_problems.greedy;

import java.util.Arrays;

public class _942_diStringMatch {
    public static void main(String[] args) {
        String s1 = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s1)));
    }

    public static int[] diStringMatch(String s) {
        int len = s.length();
        int l = 0;
        int h = len;
        int[] res = new int[len+1];
        char[] ar = s.toCharArray();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 'I') {
                res[i] = l;
                ++l;
            }
            else {
                res[i] = h;
                --h;
            }
        }
        res[len] = h;

        return res;
    }
}