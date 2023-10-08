package leetcode_problems;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class isPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String s1 = "";

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) s1 += s.charAt(i);
        }

        char[] reverseS = new char[s1.length()];

        for (int i = 0; i < reverseS.length; i++) {
            reverseS[i] = s1.charAt(s1.length()-1-i);
        }

        String s2 = "";

        for (char c : reverseS) {
            s2 += c;
        }


        return s1.equals(s2);
    }
}
