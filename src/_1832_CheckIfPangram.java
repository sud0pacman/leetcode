package leetcode_problems;

public class _1832_CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;

        String cs;
        for (char c = 'a'; c <= 'z'; c++) {
            cs = Character.toString(c);
            if (!sentence.contains(cs)) {
                return false;
            }
        }

        return true;
    }
}
