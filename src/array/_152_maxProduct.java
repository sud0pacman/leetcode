package leetcode_problems.array;

public class _152_maxProduct {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }

        System.out.println(left);


        left = 0;
        right = arr.length-1;


        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else if (arr[mid] > arr[mid + 1]) right = mid;
        }


        return arr[right];
    }
}
