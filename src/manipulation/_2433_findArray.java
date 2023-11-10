package manipulation;

import java.util.Arrays;

public class _2433_findArray {
    public static void main(String[] args) {
        int[] nums = {5, 2, 0, 3, 1};

        System.out.println(Arrays.toString(findArray(nums)));
    }

    public static int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i-1];
        }

        return arr;
    }
}