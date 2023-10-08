package leetcode_problems;

public class GetLucky_1945 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;

        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        char[] chars = s.toCharArray();
        String num = conversation(chars);

        while (k > 0) {
            num = transform(num);
            --k;
        }

        return Integer.parseInt(num);
    }

    public static String conversation(char[] chs) {
        StringBuilder sb = new StringBuilder();

        for (char c : chs) {
            sb.append(c-96);
        }

        return sb.toString();
    }

    public static String transform(String num) {
        int sum = 0;
        char[] nums = num.toCharArray();
        int i = nums.length-1;

        while (i >= 0) {
            sum += nums[i] - '0';
            --i;
        }

        return String.valueOf(sum);
    }
}
