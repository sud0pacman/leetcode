package leetcode_problems;

import java.util.Scanner;

public class strStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.next();

        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        int index = -1;
        int len = needle.length();

        for (int i = 0; i < (haystack.length()-len)+1; i++) {
            if (haystack.startsWith(needle, i)) {
                index = i;
                break;
            }
        }

        return index;
    }
}
