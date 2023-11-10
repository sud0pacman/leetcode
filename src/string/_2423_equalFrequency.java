package string;

import java.util.HashSet;
import java.util.Set;

public class _2423_equalFrequency {
    public static void main(String[] args) {
        String word = "ddaccb";
        System.out.println(equalFrequency(word));
    }

    public static boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c-'a']++;
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 26; ++i) {
            set.add(freq[i]);
        }

        System.out.println(set);

        int m = 0;
        for (Integer i : set) {
            m = i;
        }
        if (m > 1) return false;

        System.out.println(set);
        if (set.size() == 3) return true;


        return false;
    }
}
