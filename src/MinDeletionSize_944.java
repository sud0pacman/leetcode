package leetcode_problems;

public class MinDeletionSize_944 {
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0, c = 0, i, l = strs.length;

        while(c < strs[0].length()) {
            for (i = 1; i < l; i++) {
                if (strs[i-1].charAt(c) > strs[i].charAt(c)) {
                    ++count;
                    break;
                }
            }
            ++c;
        }
        return count;
    }
}