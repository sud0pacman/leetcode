package leetcode_problems;

public class _1903_LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("10133890"));
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
