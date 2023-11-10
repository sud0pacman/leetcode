package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1282_groupThePeople {
    public static void main(String[] args) {
        int[] groupSize = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(groupSize));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> m = new HashMap<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> temp = m.getOrDefault(groupSizes[i], new ArrayList<>());

            if (i == 5) System.out.println(temp.size());
            if (temp.size() == groupSizes[i]) {
                res.add(temp);
                temp = new ArrayList<>();
            }

            temp.add(i);
            m.put(groupSizes[i], temp);
            //System.out.println(temp);
        }

        for (int size : m.keySet()) {
            res.add(m.get(size));
        }

        return res;
    }
}
