package greedy;

public class _680_validPalindrome {
    public static void main(String[] args) {
        String s  = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ss = s.toCharArray();

        while(left < right) {
            if(ss[left] != ss[right]) {
                break;
            }
            left++;
            right--;
        }

        if(left >= right) {
            return true;
        }

        return isSubPalindrome(ss,left+1,right) || isSubPalindrome(ss,left,right - 1);
    }

    private static boolean isSubPalindrome(char[] ar, int i, int right) {
        while (i < right) {
            if (ar[i] != ar[right]) {
                return false;
            }
            ++i;
            --right;
        }

        return true;
    }


    // ebcbbececabbacecbbcbe
    // ebcbb
}
