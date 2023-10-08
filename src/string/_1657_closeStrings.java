package leetcode_problems.string;

import java.util.*;

public class _1657_closeStrings {
    public static void main(String[] args) {
        String word1 = "abbzzca";
        String word2 = "babzzcz";

        System.out.println(closeStrings(word1, word2));
    }

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        int[] w1 = new int[26];
        int[] w2 = new int[26];

        for (int i = word1.length()-1; i >= 0; i--) {
            w1[word1.charAt(i)-97]++;
        }

        for (int i = word2.length()-1; i >= 0; i--) {
            w2[word2.charAt(i)-97]++;
        }

        for (int i = w1.length-1; i >= 0; i--) {
            if (w1[i] ==0 && w2[i] > 0 || w1[i] > 0 && w2[i] == 0) return false;
        }

        sort(w1);
        sort(w2);

        for (int i = w1.length-1; i >= 0; i--) {
            if (w1[i] != w2[i]) return false;
        }

        return true;
    }

    public static void sort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public static void divide(int[] arr, int left, int right) {
        if (left == right) return;

        int middle = (left + right) / 2;

        divide(arr, left, middle);
        divide(arr, middle + 1, right);

        merge(arr, left, middle, right);
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];

        int aPos = left;
        int bPos = middle + 1;
        int pos = 0;

        while (aPos <= middle && bPos <= right) {
            if (arr[aPos] < arr[bPos]) {
                temp[pos++] = arr[aPos++];
            } else {
                temp[pos++] = arr[bPos++];
            }
        }

        while (aPos <= middle) {
            temp[pos++] = arr[aPos++];
        }

        while (bPos <= right) {
            temp[pos++] = arr[bPos++];
        }

        for (int i = left; i <=right; ++ i) {
            arr[i] = temp[i-left];
        }
    }
}