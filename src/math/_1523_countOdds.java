package math;

public class _1523_countOdds {
    public static void main(String[] args) {
        int low = 8, high = 10;

        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        int res = (high - low) >> 1;
        if((low % 2) == 1 || (high % 2) == 1)  {
            ++res;
        }
        return res;
    }
}
