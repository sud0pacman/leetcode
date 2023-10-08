package leetcode_problems.hash_table;

import java.util.HashMap;
import java.util.HashSet;

public class _771_numJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ch1 =stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                char ch2 = jewels.charAt(j);
                if(ch1 == ch2){
                    count=count+1;
                }
            }
        }
        return count;

//        HashSet<Character> set = new HashSet<>();
//        int ans = 0;
//        for (char ch : jewels.toCharArray()) {
//            set.add(ch);
//        }
//
//        for (char ch : stones.toCharArray()) {
//            if (set.contains(ch)) {
//                ans++;
//            }
//        }
//        return ans;

//        int count = 0;
//        int[] js = new int[123];
//
//        for (char c : jewels.toCharArray()) {
//            js[c]++;
//        }
//
//        for (char c : stones.toCharArray()) {
//            if (js[c] != 0) ++count;
//        }
//
//        return count;
    }
}
