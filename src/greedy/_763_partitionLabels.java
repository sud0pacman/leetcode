package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _763_partitionLabels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> ls = new ArrayList<>();
        char[] ar = s.toCharArray();

        int[] positions = new int[123];

        for (int i = 0; i < ar.length; i++) {
            positions[ar[i]] = i;
        }

        int max = 0;
        int prev = -1;

        for (int i = 0; i < ar.length; i++) {
            max = Math.max(positions[ar[i]], max);

            if (i == max) {
                ls.add(max-prev);
                prev = max;
            }
        }

        return ls;
    }
}
