package leetcode_problems.hash_table;

import java.util.HashSet;
import java.util.Set;

public class _804_uniqueMorseRepresentations {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};

        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet<>();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            char[] chars = word.toCharArray();
            for (char c: chars)
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}
