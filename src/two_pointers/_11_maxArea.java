package leetcode_problems.two_pointers;

public class _11_maxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            water = Math.max(water, h * (right - left));

            while (height[left] <= h && left < right) left++;
            while (height[right] <= h && left < right) right--;
        }
        return water;
    }
}
