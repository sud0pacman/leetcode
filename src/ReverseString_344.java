package leetcode_problems;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
//        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
//            char temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//        }

        int i = 0;
        char temp;

        while (i < s.length/2) {
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
            ++i;
        }

        System.out.println(s);
    }
}
