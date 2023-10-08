package leetcode_problems;

import java.util.Arrays;

public class ReverseString_541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;

        --n;
        int i;
        for(i = 0 ; i <= n; i += 2*k){
            reverseK(i, Math.min(i + k - 1, n), str);
        }

        return new String(str);
    }
    public static void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
