package sliding_window;

import java.util.*;

public class _187_findRepeatedDnaSequences {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>(), repeated = new HashSet<>();

        for (int i = 0; i+9 < s.length(); ++i) {
            String dnk = s.substring(i, i+10);
            if (!seen.add(dnk)) {
                repeated.add(s);
            }
        }

        return new ArrayList<>(repeated);
    }
}
