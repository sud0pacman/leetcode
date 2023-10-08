package leetcode_problems;

public class RemoveTrailingZeros_2710 {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
    }

    public static String removeTrailingZeros(String num) {
        int i = num.length()-1;

        while (i >= 0) {
            if (num.charAt(i) != '0') break;
            --i;
        }

        return num.substring(0, i+1);
    }
}
