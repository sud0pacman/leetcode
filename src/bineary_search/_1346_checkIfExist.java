package leetcode_problems.bineary_search;

public class _1346_checkIfExist {
    public static void main(String[] args) {
        int[] arr = {10,5,-9,15,3,8,12,-10};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            int target = LinearSearch(arr, arr[i] * 2);

            if(target>= 0 && target!= i){
                return true;
            }
        }
        return false;
    }
    static int LinearSearch(int[] arr, int k){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}