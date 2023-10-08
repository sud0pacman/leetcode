package leetcode_problems;

public class IsPrefixOfWord_1455 {
    public static void main(String[] args) {
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s= sentence.split(" ");

        int i=0;
        for(String word: s){
            i++;
            if(word.startsWith(searchWord)) return i;
        }
        return -1;
    }
}
