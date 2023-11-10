package string;

public class _686_repeatedStringMatch {
    public static void main(String[] args) {
        String a = "abcd", b = "cdabcdab";

        System.out.println(repeatedStringMatch(a, b));
    }

    public static int repeatedStringMatch(String a, String b) {
        boolean[] bucket = new boolean[26];
        for (char c : a.toCharArray())
            bucket[c - 'a'] = true;

        for (char c : b.toCharArray()) {
            if (!bucket[c - 'a'])
                return -1;
        }

        int cnt = b.length() / a.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.append(a);
        }

        for (int i = 0; i < 3; i++) {
            if (sb.indexOf(b) >= 0)
                return cnt + i;

            sb.append(a);
        }


        return -1;
    }
}
