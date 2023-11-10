package sliding_window;

public class _2269_divisorSubstrings {
    public static void main(String[] args) {
        System.out.println(5 ^ 7);
        int num = 240;
        int k = 2;

        System.out.println(divisorSubstrings(num, k));
    }
    // 276013000
    //   6013000
    //  7601300
    // 2760130
    public static int divisorSubstrings(int num, int k) {
        int ten = (int) Math.pow(10, k);
        int len = ((int) Math.log10(num) + 1) - k + 1;
        int safe = num;
        int count = 0;

        while (len > 0) {
            int n = num % ten;
            //System.out.println(num);

            if (n > 0 && safe % n == 0) ++count;
            num /= 10;
            --len;
        }

        return count;
    }
}
