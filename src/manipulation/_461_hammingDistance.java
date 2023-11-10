package manipulation;

public class _461_hammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        System.out.println(hammingDistance(x, y));
        // 001
        // 100
        // 101 XOR ed
        // count bits => 2
    }

    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;

        while(n != 0) {
            n &= n-1;
            ++count;
        }

        return count;
    }
}
