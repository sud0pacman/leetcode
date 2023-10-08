package leetcode_problems.hash_table;

import java.util.*;

public class _1207_uniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int ele = arr[i];
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }

        //Constriant given

        Set<Integer> set = new HashSet<>();

        for(Map.Entry<Integer,Integer> e: map.entrySet())
            if(!set.add(e.getValue())) return false;

        return true;
    }
}
