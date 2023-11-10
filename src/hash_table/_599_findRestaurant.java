package hash_table;

import java.util.Arrays;

public class _599_findRestaurant {
    public static void main(String[] args) {
        // 1 -> 5
        // 2 -> 15
        // 3 -> 35
        // 4 -> 70
        // 5*1 + 0 = 5
        // 5*2 + 5 + 0 = 15
        // 5*3 + 15 + 5 + 0 = 35
        // 5*4 + 35 + 15 + 5 + 0 = 75
        // 5*5 + 75 + 35 + 15 + 5 + 0 = 155
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        int max = 30;
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < list1.length; ++i) {
            for(int j = 0; j < list2.length; ++j) {
                if(list1[i].equals(list2[j])) {
                    if(i+j < max) {
                        max = i+j;
                        res.append(list1[i]).append(" ");
                    }
                }
            }
        }

        return res.toString().split(" ");
    }

    // paper title
    // 21211
    // 21211
}