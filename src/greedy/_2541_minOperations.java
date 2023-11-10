package greedy;

public class _2541_minOperations {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.print((i*2)+1 + " ");
        }
    }

    public long minOperations(int[] nums1, int[] nums2, int k) {
        // agar nums1[i] < nums2[i] dan kichik bo'lsa masofani k orqali to'grilab bo'lishi kerak
        // aks holda ham shunday bo'lishi kerak
        // 2 holatda ham massivni tenglasahga ketgan harakat teng bo'lishi kerak

        long possitiveSum = 0;
        long negetiveSum = 0;
        int len = nums1.length - 1;
        int temp;
        if (k != 0) {
            for (; 0 <= len; len--) {
                temp = nums1[len] - nums2[len];

                if (temp % k != 0) {
                    return -1;
                }
                if (temp > 0) {

                    possitiveSum += temp;
                } else {

                    negetiveSum += temp;
                }
            }
            if (possitiveSum == -negetiveSum) {
                return possitiveSum / k;
            }
            return -1;

        } else {
            for (; 0 <= len; len--) {
                if (nums1[len] != nums2[len]) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
