package hash_table;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1385_findTheDistanceValue {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        findTheDistanceValue(arr1, arr2, d);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for (int value : arr1)
            if (find(arr2, value, d)) cnt++;

        return cnt;
    }

    public static boolean find(int[] arr, int n, int d) {
        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(n - arr[i]);
            if (diff <= d) {
                return false;
            }
        }
        return true;
    }
}
