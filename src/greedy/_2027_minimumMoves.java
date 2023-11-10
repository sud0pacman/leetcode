package greedy;

public class _2027_minimumMoves {
    public static void main(String[] args) {
    }

    public static int minimumMoves(String s) {
        int count = 0;

        char[] ss = s.toCharArray();

        for(int i = 0; i < ss.length; ++i) {
            if(ss[i] == 'X') {
                ++ count;
                i += 2;
            }
        }

        return count;
    }
}
