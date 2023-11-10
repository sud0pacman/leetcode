package array;

import java.util.Arrays;

public class _1619_trimMean {
    public static void main(String[] args) {

    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int l = (int) (arr.length * 0.05);
        int len = arr.length-l;
        double sum = 0;

        for (; l < len; ++l) {
            sum += arr[l];
        }

        return sum / (len-l);
    }
}
