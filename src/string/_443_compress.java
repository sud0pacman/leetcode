package leetcode_problems.string;

public class _443_compress {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int ans = 0;

        for (int i = 0; i < chars.length; ) {
            char letter = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }
            chars[ans++] = letter;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }

        return ans;
    }
}
