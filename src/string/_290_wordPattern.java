package string;

import java.util.Arrays;
import java.util.HashMap;

public class _290_wordPattern {
    public static void main(String[] args) {
        String pattern = "abab";
        String s = "dog cat cat dog";
        System.out.println(args.length);

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
            return false
                    ;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            String str = arr[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(str))
                    return false;
            } else {
                if (map.containsValue(str))
                    return false;
                map.put(c, str);
            }
        }
        return true;
    }
}
