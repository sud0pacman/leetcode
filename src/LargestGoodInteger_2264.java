package leetcode_problems;

public class LargestGoodInteger_2264 {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("222"));
    }

    public static String largestGoodInteger(String num) {
        int ans = -1;
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2))
                ans = Math.max(ans, num.charAt(i) - '0');
        }
        StringBuilder sb = new StringBuilder(3);
        for (int i = 0; i < 3; i++) sb.append(ans);
        return ans != -1 ? sb.toString() : "";
    }
}
