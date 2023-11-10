package array;

public class _1535_getWinner {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int k = 10000;
        System.out.println(getWinner(arr, k));
    }

    public static int getWinner(int[] arr, int k) {
        int count = 0;
        int winner = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > winner) {
                count = 0;
                winner = arr[i];
            }

            if (++count == k) {
                return winner;
            }
        }

        return winner;
    }

    // 3 2 1
    // l
}