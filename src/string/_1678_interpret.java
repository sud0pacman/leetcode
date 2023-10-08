package leetcode_problems.string;

public class _1678_interpret {
    public static void main(String[] args) {
        String t1 = "G()(al)";
        String t2 = "G()()()()(al)";
        String t3 = "(al)G(al)()()G";
        System.out.println(interpret(t3));
    }

    public static String interpret(String command) {
        char[] chs = command.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < chs.length) {
            if (chs[i] == '(') {
                ++i;
                if (chs[i] == ')') {
                    sb.append("o");
                    ++i;
                }
            }
            else {
                if (chs[i] != ')')sb.append(chs[i]);
                i++;
            }
        }

        return sb.toString();
    }
}
