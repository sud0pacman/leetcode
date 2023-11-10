package two_pointers;

public class _1332_removePalindromeSub {
    public static void main(String[] args) {
        String s = "ababa";

        System.out.println(removePalindromeSub(s));
    }

    public static int removePalindromeSub(String s) {
        int l = 0, r = s.length() - 1;

        while(l < r)
            if(s.charAt(l++) != s.charAt(r--))
                return 2;

        return 1;
    }
}