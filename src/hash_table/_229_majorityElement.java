package hash_table;

import java.util.*;

public class _229_majorityElement {
    public static void main(String[] args) {
        _229_majorityElement MajorityElement = new _229_majorityElement();
        int[] nums = {3, 2, 3};
        System.out.println(MajorityElement.majorityElement(nums));
    }

    List<Integer> res = new ArrayList<>();
    int pivot = 0;

    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        pivot = len / 3;
        quickSort(nums, 0, nums.length - 1);
        return res;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (end - start < pivot) {
            return;
        }
        int left = start;
        int right = end;
        int i = start + 1;
        while (right >= i) {
            if (nums[left] > nums[i]) {
                swap(nums, left, i);
                i++;
                left++;
            } else if (nums[left] < nums[i]) {
                if (nums[i] > nums[right]) {
                    swap(nums, i, right);
                }
                right--;
            } else {
                i++;
            }
        }
        if (right - left >= pivot) {
            res.add(nums[right]);
        }
        quickSort(nums, start, left - 1);
        quickSort(nums, right + 1, end);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
