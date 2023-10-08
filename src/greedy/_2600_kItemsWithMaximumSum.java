package greedy;

public class _2600_kItemsWithMaximumSum {
    public static void main(String[] args) {
    }

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k) return k;
        int sum = numOnes;
        k -= numOnes;
        if (numZeros >= k) return sum;

        while (numZeros > 0 && k > 0) {
            --k;
            --numZeros;
        }

        while (numNegOnes > 0 && k > 0) {
            --k;
            --numNegOnes;
            --sum;
        }

        return sum;
    }
}
