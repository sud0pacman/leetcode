package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2788_splitWordsBySeparator {
    public static void main(String[] args) {
        String[] ar = {"$easy$","$problem$"};
        List<String> words = new ArrayList<>(Arrays.asList(ar));
        char separator = '$';

        System.out.println(splitWordsBySeparator(words, separator));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        StringBuilder sb;

        for (String word : words) {
            char[] ar = word.toCharArray();
            sb = new StringBuilder();

            for (char c : ar) {
                if (c != separator) {
                    sb.append(c);
                }
                else {
                    if (sb.length() == 0) continue;
                    res.add(sb.toString());
                    sb = new StringBuilder();
                }
            }

            if (sb.length() == 0) continue;
            res.add(sb.toString());
        }

        return res;
    }
}
