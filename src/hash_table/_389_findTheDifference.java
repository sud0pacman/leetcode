package leetcode_problems.hash_table;

public class _389_findTheDifference {
    public static void main(String[] args) {

    }
    public char findTheDifference(String s, String t) {
        char ans = 0;

        for (char c : s.toCharArray()) {
            ans -= c;
        }

        for (char c : t.toCharArray()) {
            ans += c;
        }

        return ans;
    }
}
