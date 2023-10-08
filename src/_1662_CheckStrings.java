package leetcode_problems;

public class _1662_CheckStrings {
    public static void main(String[] args) {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(s1, s2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s1: word1){sb1.append(s1);}
        for(String s2: word2){sb2.append(s2);}

        return sb1.toString().equals(sb2.toString());
    }
}
