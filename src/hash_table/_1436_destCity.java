package leetcode_problems.hash_table;

import java.util.List;

public class _1436_destCity {
    public static void main(String[] args) {

    }

    public String destCity(List<List<String>> paths) {
        List<String> last = paths.get(paths.size()-1);
        return last.get(last.size()-1);
    }
}
