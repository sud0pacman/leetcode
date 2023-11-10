package greedy;

import java.util.Arrays;

public class _143_checkIfCanBreak {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "xya";
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();


        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] >= ar2[i]) return;
        }















//        Arrays.sort(ar1);
//        Arrays.sort(ar2);
//        int[] count1 = new int[26];
//        int[] count2 = new int[26];
//
//        for (char c : ar1)count1[c-'a']++;
//        for (char c : ar2)count2[c-'a']++;
//
//        Arrays.sort(ar1);
//        Arrays.sort(ar2);
//
//        System.out.println(Arrays.toString(count1));
//        System.out.println(Arrays.toString(count2));
//
////        for (int i = 0; i < ar1.length; i++) {
////            System.out.println(ar1[i] - ar2[i]);
////        }
//
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println((int) 'a' + " " + (int) 'x' + " " + ((int) 'a' - (int) 'x'));
//        System.out.println((int) 'b' + " " + (int) 'y' + " " + ((int) 'a' - (int) 'x'));
//        System.out.println((int) 'c' + " " + (int) 'a' + " " + ((int) 'a' - (int) 'x'));
    }

}
