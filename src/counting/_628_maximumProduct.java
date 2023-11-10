package counting;

public class _628_maximumProduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int[] count = new int[2001];

        for (int num : nums) {
            ++count[num+1000];
        }

        int c = 3;
        int res1 = 1;

        for (int i = count.length - 1;  i >= 0 && c > 0; i--) {
            while (count[i] > 0) {
                res1 *= i-1000;
                --count[i];
                --c;
            }
        }

        int res2 = 1;
        c = 2;
        for (int i = 0; i < count.length && c > 0; i++) {
            while (count[i] > 0) {
                res2 *= i-1000;
                --count[i];
                --c;
            }
        }

        c = 1;
        for (int i = count.length-1; i > 0 && c > 0; i--) {
            while (count[i] > 0) {
                res2 *= i-1000;
                --count[i];
                --c;
            }
        }

        return Math.max(res1, res2);
    }
}
