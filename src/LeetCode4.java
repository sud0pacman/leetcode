package leetcode_problems;

import java.util.Scanner;

public class LeetCode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if(s.length() == 1) return false;
        int countYO = 0;
        int countYC = 0;

        int countTO = 0;
        int countTC = 0;

        for(int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);

            if (ch == 40) ++countYO;
            else if (ch == 41) ++countYC;

            if (i != 0 && ch == 41) {
                System.out.println();
            }
//            if(ch == 91) ++countTO;
//            if(ch == 93) ++countTC;
//
//            if (countTO < countTC) return false;

//            if(ch == 123) ++countJO;
//            if(ch == 125) ++countJC;
//
//            if (countJO < countJC) return false;
        }

        return countYO == countYC;
    }
}
