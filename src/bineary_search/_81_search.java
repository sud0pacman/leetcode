package leetcode_problems.bineary_search;

public class _81_search {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;

        System.out.println(search(nums, target));
    }

    public static boolean search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return true;

            if (arr[mid] == arr[left] && arr[mid] == arr[right]) {
                ++left;
                --right;
                continue;
            }

            if (arr[left] <= mid) {
                if (arr[left] <= target && target <= arr[mid]) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            else {
                if (arr[mid] <= target && target <= arr[right]) {
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
            }
        }

        return arr[left] == target;
    }
}
