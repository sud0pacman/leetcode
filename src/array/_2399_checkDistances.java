package array;

import java.util.Arrays;

public class _2399_checkDistances {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(checkDistances(s, distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        int[] dist = new int[26];
        char[] ss = s.toCharArray();

//        for (int i = 0; i < s.length(); i++) {
//            int end = s.lastIndexOf(s.charAt(i));
//            if (end != i) dist[s.charAt(i) - 97] = end - i - 1;
//            if (dist[s.charAt(i) - 97] != distance[s.charAt(i) - 97]) return false;
//        }

        for (int i = 0; i < ss.length; i++) {
            int end = s.lastIndexOf(s.charAt(i));
            if (end != i) dist[ss[i] - 97] = end - i - 1;
            if (dist[ss[i] - 97] != distance[ss[i] - 97]) return false;
        }

        return true;
    }
}