package greedy;

public class _1710_maximumUnits {
    public static void main(String[] args) {

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] ar = new int[1001];
        for (int[] a : boxTypes) {
            ar[a[1]] += a[0];
        }

        int res = 0;
        int min;

        for (int i = 1000; i > 0 && truckSize > 0; i--) {
            min = Math.min(ar[i], truckSize);
            res += min*i;
            truckSize -= min;
        }

        return res;
    }
}
