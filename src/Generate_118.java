
package leetcode_problems;


import java.util.Arrays;

public class Generate_118 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProf = 0;
        int sum = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            sum = price - minPrice;

            if (sum > maxProf) {
                maxProf = sum;
            }
        }

        return maxProf;
    }
}

