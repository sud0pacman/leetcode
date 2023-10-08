package leetcode_problems;

public class _345_ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] ch = getVowels(s);
        char[] chars = s.toCharArray();
        int c = 0;
        int len = ch.length;

        if (len == 1) return s;

        for (int i = 0; i < chars.length; i++) {
            if (c < len && chars[i] == ch[c]) {
                chars[i] = ch[len-1-c];
                ++c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) sb.append(chars[i]);

        s = String.valueOf(sb);
        return s;
    }

    public static char[] getVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A': case 'E': case 'I': case 'O': case 'U': case 'a': case 'e': case 'i': case 'o': case 'u': {
                    sb.append(s.charAt(i));
                    break;
                }
            }
        }

        return sb.toString().toCharArray();
    }
}
