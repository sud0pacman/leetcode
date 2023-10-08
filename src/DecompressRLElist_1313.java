package leetcode_problems;

import java.util.Arrays;

public class DecompressRLElist_1313 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int k = 0;

        for(int i=0 ; i<nums.length; i+=2){
            k+=nums[i];
        }

        int[] arr = new int[k];


        k = 0;
        for(int i=0; i<nums.length; i+=2){
            for(int j=0; j<nums[i]; j++){
                arr[k++] = nums[i+1];
            }
        }
        return arr;
    }
}
