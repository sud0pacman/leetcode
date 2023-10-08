package algorithms;

import java.util.ArrayList;
import java.util.List;

public class BestQuickSort {

    List<Integer> resp = new ArrayList<>();
    int pivot = 0;
    public void quickSort(int[] nums, int start, int end) {
        if(end-start < pivot) {
            return;
        }
        int left = start;
        int right = end;
        int i = start+1;
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
        if(right-left >= pivot) {
            resp.add(nums[right]);
        }
        quickSort(nums, start, left-1);
        quickSort(nums, right+1, end);

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
