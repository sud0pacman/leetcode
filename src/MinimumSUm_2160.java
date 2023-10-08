package leetcode_problems;

import java.util.Arrays;

public class MinimumSUm_2160 {
    public static void main(String[] args) {
        int n = 2923;
        System.out.println(minimumSum(n));
    }

    public static int minimumSum(int num) {
        char[] arr= String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        int n1 = Character.getNumericValue(arr[0]);
        int n2 = Character.getNumericValue(arr[1]);
        int n3 = Character.getNumericValue(arr[2]);
        int n4 = Character.getNumericValue(arr[3]);

        return (n1*10+n3) + (n2*10+n4);
    }
}
