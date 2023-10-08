package leetcode_problems;

public class _2042_AreNumbersAscending {
    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s) {
        boolean isNumberStarted = false;
        int l = 0, n = 0;
        s += " "; // oxiri raqam bn tugasa else shartiga o\tmaydi shuning uchun bita ko'p aylanishi kk
        // ana ushanda else if sharti ham ishlaydi

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = (n * 10) + (c - '0');
                isNumberStarted = true;
            } else if (isNumberStarted) {
                if (l >= n) {
                    return false;
                }
                l = n;
                n = 0;
                isNumberStarted = false;
            }
        }

        return true;
    }
}
