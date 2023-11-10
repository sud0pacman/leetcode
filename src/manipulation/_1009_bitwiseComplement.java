package manipulation;

public class _1009_bitwiseComplement {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(bitwiseComplement(n));
    }

    // 111
    // 101
    // 010

    public static int bitwiseComplement(int n) {
        if (n == 0)
            return 1;
        else
            return ((1 << Integer.toBinaryString(n).length()) - 1) ^ n;
    }

    //      10010
    //      01101
}