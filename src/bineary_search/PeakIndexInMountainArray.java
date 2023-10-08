package leetcode_problems.bineary_search;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {2,3,2,4};
        System.out.println(peakIndexInMountainArray(nums));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid;
            }
        }

        return low;
    }
}