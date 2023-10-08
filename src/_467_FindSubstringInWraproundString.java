package leetcode_problems;

public class _467_FindSubstringInWraproundString {
    public static void main(String[] args) {
        System.out.println(findSubstringInWraproundString("zab"));
    }

    public static int findSubstringInWraproundString(String s) {
        int[] list = new int[26];
        int count = 1;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && (arr[i] - arr[i - 1] + 26) % 26 == 1) count++;
            else count = 1;
            list[arr[i] - 'a'] = Math.max(list[arr[i] - 'a'], count);
        }
        int sum = 0;

        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
