package leetcode_problems;

public class ModifyString_1576 {
    public static void main(String[] args) {
        System.out.println(modifyString("j?qg??b"));
    }

    public static String modifyString(String s) {
        if (s.equals("?")) {    // edge case
            return "a";
        }

        char[] a = s.toCharArray();

        int i = 0, l = a.length;
        char c;

        while (i < l) {
            if (a[i] == '?') {
                for (c = 'a'; c <= 'z'; c++) {
                    a[i] = c;

                    if (i > 0 && a[i - 1] == c) continue;
                    else if (i + 1 < l && a[i + 1] == c) continue;

                    break;
                }
            }

            ++i;
        }

        return new String(a);
    }
}