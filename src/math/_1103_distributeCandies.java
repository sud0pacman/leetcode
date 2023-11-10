package math;

public class _1103_distributeCandies {
    public static void main(String[] args) {
        System.out.println(5 >>> 1);
//        int candies = 7, num_people = 4;
//        System.out.println(Arrays.toString(distributeCandies(candies, num_people)));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];

        int i = 0;
        int candy = 1;

        while (candy < candies) {
            if (i == num_people) {
                i = 0;
                continue;
            }

            candies -= candy;
            res[i++] += candy++;
        }

        if (i == num_people) i = 0;
        if (candy >= candies) res[i] += candies;

        return res;
    }
}
