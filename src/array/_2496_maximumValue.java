package array;

public class _2496_maximumValue {
    public static void main(String[] args) {
        String[] strings = {"alic3", "bob", "3", "4", "00000"};
        System.out.println(maximumValue(strings));
    }

    public static int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;

        for (String s : strs) {
            boolean isDigit = true;

            char[] ar = s.toCharArray();

            for (int i = 0; i < ar.length; i++) {
                if(ar[i] >= '0' && ar[i] <= '9') {
                }
                else {
                    // agar s da string bo'lsa s ni lengthni max bn solishtirsak bas
                    max = Math.max(max, s.length());
                    isDigit = false;
                    i = ar.length;
                }
            }

            if (isDigit) {
                max = Math.max(max, Integer.parseInt(s));
            }
        }

        return max;
    }
}
