package leetcode_problems.string;

public class _316_removeDuplicateLetters {
    public static void main(String[] args) {

    }

    public String removeDuplicateLetters(String s) {
        int[] let = new int[26];
        for (char c : s.toCharArray()) {
            let[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < let.length; i++) {
            if (let[i] == 1) {
                sb.append((char) (let[i]+'a'));
            }
            -- let[i];
        }

        return sb.toString();
    }
}
