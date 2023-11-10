package string;

import java.util.Arrays;

public class _844_uncommonFromSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        StringBuilder res = new StringBuilder();
        int l1 = 0, l2 = 0;

        while (l1 < ss1.length && l2 < ss2.length) {
            if (ss1[l1] != ss2[l2]) {
                System.out.println();
                StringBuilder word = new StringBuilder();
                while (l1 > -1 && ss1[l1] != ' ') --l1;
                while (l2 > -1 && ss2[l2] != ' ') --l2;

                if (ss1[l1] == ' ') ++l1;
                if (ss2[l2] == ' ') ++l2;

                while (l1 < ss1.length && ss1[l1] != ' ') {
                    word.append(ss1[l1]);
                    ++l1;
                }
                word.append(" ");

                while (l2 < ss2.length && ss2[l2] != ' ') {
                    word.append(ss2[l2]);
                    ++l2;
                }
                word.append(" ");

                res.append(word);
            }

            ++l1;
            ++l2;
        }

        return res.toString().split(" ");
    }
}