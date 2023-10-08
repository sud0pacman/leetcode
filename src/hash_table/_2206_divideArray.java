package leetcode_problems.hash_table;

public class _2206_divideArray {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
//        Map<Integer, Integer> mp = new HashMap<>();
//        for (int num : nums) {
//            mp.put(num, mp.getOrDefault(num, 0) + 1);
//        }
//
//        for (int i : mp.keySet()) {
//            if (mp.get(i) % 2 != 0) return false;
//        }
//
//        return true;
        byte[] digit = new byte[501];

        for (int i = 0; i < nums.length; i++) {
            digit[nums[i]]++;
        }

        for (int i = 0; i < digit.length; i++) {
            if (digit[i] % 2 != 0) return false;
        }

        return true;
    }
}
