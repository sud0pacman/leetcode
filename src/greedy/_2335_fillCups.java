package greedy;

import java.util.Arrays;

public class _2335_fillCups {
    public static void main(String[] args) {
        int[] amount = {5,4,4};
        System.out.println(fillCups(amount));
    }

    public static int fillCups(int[] amount) {
        Arrays.sort(amount);
        int count = 0;

        while (amount[1] > 0 || amount[2] > 0) {
            --amount[2];
            --amount[1];

            Arrays.sort(amount);
            ++count;
        }

        return count;
    }
}