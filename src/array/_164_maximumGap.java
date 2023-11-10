package array;

public class _164_maximumGap {
    public static void main(String[] args) {
        int[] nums = {100,3,2,1};
        System.out.println(maximumGap(nums));
    }

    public static int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        quickSort(nums);
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < nums.length; ++i) {
            max = Math.max(nums[i] - nums[i-1], max);
        }

        return max;
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
