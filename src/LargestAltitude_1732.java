package leetcode_problems;

public class LargestAltitude_1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int point = 0;
        int i = 0;

        while(i < gain.length) {
            point += gain[i];
            if(point > max) max = point;
            ++i;
        }

        return max;
    }
}
