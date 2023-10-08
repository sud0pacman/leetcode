package string;

public class _1221_balancedStringSplit {
    public static void main(String[] args) {

    }

    public static int balancedStringSplit(String s) {
        int cR = 0, cL = 0, count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R')
                ++ cR;
            else if (c == 'L')
                ++ cL;

            if (cR == cL) {
                ++ count;
                cR = 0;
                cL = 0;
            }
        }

        return count;
    }
}
