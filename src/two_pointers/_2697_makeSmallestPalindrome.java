package two_pointers;

public class _2697_makeSmallestPalindrome {
    public static void main(String[] args) {

    }

    public static String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length-1;

        while (l < r) {
            if (arr[l] < arr[r]) {
                arr[r] = arr[l];
            }
            else {
                arr[l] = arr[r];
            }

            ++l;
            --r;
        }

        return new String(arr);
    }
}
