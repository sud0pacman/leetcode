package stack;

import java.util.Stack;

public class _1544_makeGood {
    public static void main(String[] args) {
        String s = "abBAcC";

        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        char[] ss = s.toCharArray();
        int diff = 'a' - 'A';
        char[] res = new char[ss.length];
        int ind = 0;

        for(char c : ss) {
            if(ind != 0) {
                if (res[ind-1] - c == diff || res[ind-1] - c == -diff)  {
                    --ind;
                }
                else res[ind++] = c;
            }
            else res[ind++] = c;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ind; i++) {
            sb.append(res[i]);
        }

        return sb.toString();
    }
}
