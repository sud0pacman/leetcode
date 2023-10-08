package leetcode_problems;

public class Reformat_1417 {
    public static void main(String[] args) {
        System.out.println(reformat("ab123"));
    }

    public static String reformat(String s) {
        char[] chars = new char[s.length()];
        int i = 0, j = 1;

        for (char c : s.toCharArray()) {

            if (!Character.isDigit(c)) {
                //if (i >= s.length()) return "";
                chars[i] = c;
                i += 2;
            }
            else {
                //if (j >= s.length()) return "";
                chars[j] = c;
                j += 2;
            }

            System.out.println(chars);
        }

        return new String(chars);
    }
}
