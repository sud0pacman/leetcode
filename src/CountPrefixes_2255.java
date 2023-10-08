package leetcode_problems;

public class CountPrefixes_2255 {
    public static void main(String[] args) {
        String[] words = {"e","s","mi","e","ia","ibwu","e","e","k","ci","rip","suw","a","l"};
        String s = "e";

        System.out.println(countPrefixes(words, s));
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;

        for (String word : words) {
            if (s.startsWith(word)) count++;
        }
        return count;
    }
}
