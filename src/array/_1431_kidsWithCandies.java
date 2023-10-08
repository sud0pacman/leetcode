package leetcode_problems.array;

import java.util.ArrayList;
import java.util.List;

public class _1431_kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) res.add(true);
            else res.add(false);
        }

        return res;
    }
}
