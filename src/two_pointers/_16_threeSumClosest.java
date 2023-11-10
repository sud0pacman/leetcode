package two_pointers;

public class _16_threeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        _16_threeSumClosest fun = new _16_threeSumClosest();

        System.out.println(fun.threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {
        quickSort(nums, 0, nums.length - 1);
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Left pointer
            int right = nums.length - 1; // Right pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the current sum

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update the closest sum
                }

                if (sum < target) {
                    left++; // Move the left pointer to the right
                } else if (sum > target) {
                    right--; // Move the right pointer to the left
                } else {
                    return sum; // Found an exact match, return the sum
                }
            }
        }

        return closestSum;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
