package manipulation;

public class _190_reverseBits {
    public static void main(String[] args) {
        int n = 0b101;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
}
