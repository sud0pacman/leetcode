package leetcode_problems;

public class _2114_MaxLenSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        int count;
        for (String s : sentences) {
            count = 1;
//            for (char c : s.toCharArray()) {
//                count += c == ' ' ? 1 : 0;
//            }


            int st = s.indexOf(" ");
            while (st > 0) {
                ++count;
                st = s.indexOf(" ", st+1);
            }

            max = Integer.max(max, count);
        }
        
        return max;
    }
}
