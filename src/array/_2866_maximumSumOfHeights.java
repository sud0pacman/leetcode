package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class _2866_maximumSumOfHeights {
    public static void main(String[] args) {
        int[] nums = {6,5,3,9,};
        List<Integer> maxHeights = new ArrayList<>();
        for (int num : nums) maxHeights.add(num);

        System.out.println(maximumSumOfHeights(maxHeights));
    }

    public static long maximumSumOfHeights(List<Integer> maxHeights) {
        int max = 0;
        int index = 0;
        long[] maxH = new long[maxHeights.size()];
        for (int i = 0; i < maxHeights.size(); i++) {
            maxH[i] = maxHeights.get(i);
            if(maxHeights.get(i) > max) {
                max = maxHeights.get(i);
                index = i;
            }
        }

        long sum = 0;
        for (int i = index-1; i >= 0; i--) {
            if (maxH[i] > maxH[i+1]) {
                sum += maxH[i+1];
                maxH[i] = maxH[i+1];
            }
            else sum += maxH[i];
        }

        for (int i = index+1; i < maxH.length; ++i) {

        }

        System.out.println(Arrays.toString(maxH));

        return sum;
    }
}
