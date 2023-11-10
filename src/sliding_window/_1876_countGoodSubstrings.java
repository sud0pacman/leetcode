package sliding_window;

public class _1876_countGoodSubstrings {
    public static void main(String[] args) {

    }

    public int countGoodSubstrings(String s) {
        char[] ss = s.toCharArray();
        int count = 0;

        for(int i = 2; i < ss.length; ++i) {
            if(ss[i-2] != ss[i-1] && ss[i-2] != ss[i] && ss[i] != ss[i-1]) {
                ++count;
            }
        }

        return count;
    }
}
