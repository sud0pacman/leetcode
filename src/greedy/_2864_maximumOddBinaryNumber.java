package greedy;

public class _2864_maximumOddBinaryNumber {
    public static void main(String[] args) {
    }

    public static String maximumOddBinaryNumber(String s) {
        int ones = 0;

        char[] ss = s.toCharArray();
        for (char c: ss) ones += c - '0';

        --ones;

        for (int i = 0; i < ones; i++) ss[i] = '1';
        for (; ones < ss.length; ones++) ss[ones] = '0';
        ss[s.length()-1] = '1';

        return new String(ss);
    }
}
