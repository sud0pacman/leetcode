package counting;

import java.util.Arrays;
import java.util.HashMap;

public class _1331_arrayRankTransform {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] sort = new int[arr.length];
        System.arraycopy(arr, 0, sort, 0, arr.length);
        Arrays.sort(sort);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < sort.length; i++) {
            if (!map.containsKey(sort[i])) {
                map.put(sort[i], map.getOrDefault(sort[i], ++count));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
