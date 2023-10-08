package greedy;

public class _1974_minTimeToType {
    public static void main(String[] args) {
        String t1 = "bza";
        System.out.println(minTimeToType(t1));
    }

    public static int minTimeToType(String word) {
        int sec = 0;
        char curr = 'a';

        for (char c : word.toCharArray()) {
            sec += Math.min((c-curr+26)%26, 26-(c-curr+26)%26)+1;
            curr = c;
        }

        return sec;
    }
}
