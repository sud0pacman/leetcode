package greedy;

import java.util.Arrays;

public class _455_findContentChildren {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        Arrays.sort(g);
        Arrays.sort(s);

        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(s));

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                ++j;
                ++i;
            }
            else ++j;
        }

        return i;
    }
}
