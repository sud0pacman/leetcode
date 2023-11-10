package greedy;

public class _1013_canThreePartsEqualSum {
    public static void main(String[] args) {
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        if (sum % 3 > 0) {
            return false;
        }

        int currentSum = 0;
        int target = sum/3;
        int count = 0;

        for (int num : arr) {
            currentSum += num;

            if (currentSum == target) {
                currentSum = 0;
                ++count;

                if (count == 3) {
                    return true;
                }
            }
        }

        return false;
    }
}
