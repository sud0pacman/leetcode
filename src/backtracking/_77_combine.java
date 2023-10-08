package leetcode_problems.backtracking;

import java.util.ArrayList;
import java.util.List;

public class _77_combine {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        System.out.println(combine(n, k));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combines =new ArrayList<>();
        int i = 1;
        int j = 2;

        while (i < n) {
            while (j <= n) {
                System.out.println(i + " " + j);
                ++j;
            }

            i++;
        }

        return combines;
    }
}
