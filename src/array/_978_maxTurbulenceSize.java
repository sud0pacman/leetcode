package leetcode_problems.array;

public class _978_maxTurbulenceSize {
    public static void main(String[] args) {
        int[] arr = {250, 50, 219, 258, 199, 79, 36, 218, 218, 248};
        System.out.println(maxTurbulenceSize(arr));
    }

    public static int maxTurbulenceSize(int[] arr) {
        int ans = 1;
        int increasing = 1;
        int decreasing = 1;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[i - 1]) {
                increasing = decreasing + 1;
                decreasing = 1;
            } else if (arr[i] < arr[i - 1]) {
                decreasing = increasing + 1;
                increasing = 1;
            } else {
                increasing = 1;
                decreasing = 1;
            }
            ans = Math.max(ans, Math.max(increasing, decreasing));
        }

        return ans;
    }
}