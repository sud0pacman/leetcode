package string;

public class _1869_checkZeroOnes {
    public static void main(String[] args) {
        String s = "111000";
        System.out.println(checkZeroOnes(s));
    }

    public static boolean checkZeroOnes(String s) {
        int maxOne = 0, maxZero = 0;

        char[] ss = s.toCharArray();

        int count = 0;

        for (char c : ss) {
            if (c == '1') {
                ++count;
            }
            else {
                maxOne = Math.max(maxOne, count);
                count = 0;
            }
        }

        maxOne = Math.max(maxOne, count);

        count = 0;

        for (char c : ss) {
            if (c == '0') {
                ++count;
            }
            else {
                maxZero = Math.max(maxZero, count);
                count = 0;
            }
        }

        maxZero = Math.max(maxZero, count);


        return maxOne > maxZero;
    }
}