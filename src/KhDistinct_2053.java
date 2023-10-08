package leetcode_problems;

import java.util.Arrays;

public class KhDistinct_2053 {
    public static void main(String[] args) {
        String[] arr = {"aaa","aa","a"};
        int k = 1;

        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {
        String ans = "";
        int count = 0;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i - 1].equals(arr[i])) {
                ++count;

                if (count == k) {
                    ans = arr[i-1];
                }
            }
        }

        return ans;
    }
}
