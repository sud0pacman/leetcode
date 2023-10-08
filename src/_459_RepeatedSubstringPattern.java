package leetcode_problems;

public class _459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "ababab";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int l = s.length(), m, j;
        int i = l / 2;
        String subS;
        StringBuilder sb;

        while (i >= 1) {
            if (l % i == 0) { // qadam tashlaydi yani l uzunlik orqali s ni to'ldirib bo'lsa keyin ishladyi
                m = l / i;

                subS = s.substring(0, i);  // to'ldiruvchi qism
                sb = new StringBuilder();  // solishtir uchun

                // fill str
                j = 0;
                while (j < m) {
                    sb.append(subS);
                    ++j;
                }

                if (sb.toString().equals(s)) return true;
            }
            --i;
        }

        return false;
    }
}
