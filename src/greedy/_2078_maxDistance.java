package greedy;

public class _2078_maxDistance {
    public static void main(String[] args) {
    }

    public static int maxDistance(int[] colors) {
        int l = 0;
        int r = colors.length-1;

        while(l < r && colors[l] == colors[r]) ++l;
        int variant1 = r-l;

        l = 0;
        r = colors.length-1;

        while(l < r && colors[l] == colors[r]) --r;
        int variant2 = r-l;

        return Math.max(variant1, variant2);
    }
}
