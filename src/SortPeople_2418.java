package leetcode_problems;

import java.util.Arrays;
import java.util.HashMap;

public class SortPeople_2418 {
    public static void main(String[] args) {
        String[] names = {"IEO", "Sgizfdfrims", "QTASHKQ", "Vk", "RPJOFYZUBFSIYp", "EPCFFt", "VOYGWWNCf", "WSpmqvb"};
        int[] heights = {17233, 32521, 14087, 42738, 46669, 65662, 43204, 8224};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> myMap = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            myMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] res = new String[names.length];

        for (int i = heights.length-1; i >= 0 ; i--) {
            res[heights.length-i-1] = myMap.get(heights[i]);
        }

        return res;
    }
}