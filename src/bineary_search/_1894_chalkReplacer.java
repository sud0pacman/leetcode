package bineary_search;

public class _1894_chalkReplacer {
    public static void main(String[] args) {
        System.out.println(4%5);
        int[] chalk = {3, 4, 1, 2};
        int k = 25;

        System.out.println(chalkReplacer(chalk, k));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;

        for (int j : chalk) {
            sum += j;
        }

        long rem = k % sum;
        for (int i = 0; i < chalk.length; i++) {
            if (rem - chalk[i] >= 0) rem -= chalk[i];
            else return i;
        }

        return 0;
    }
}
