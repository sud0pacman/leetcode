package leetcode_problems.bineary_search;

public class Search {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,0,1,2};
        int target = 1;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int middle = (low+high) / 2;

            if (nums[middle] == target) return middle;

            if (nums[low] <= nums[middle]) {
                if (nums[low] <= target && target < nums[middle]) {
                    high = middle-1;
                }
                else {
                    low = middle+1;
                }
            }
            else {
                if (nums[middle] <= target && target <= nums[high]) {
                    low = middle+1;
                }
                else {
                    high = middle-1;
                }
            }
        }

        return -1;
    }
}
