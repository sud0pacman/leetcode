package leetcode_problems.array;

public class _605_canPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length-1; i++) {
            if(flowerbed[i] == 1) {i++; continue;}

            if(flowerbed[i+1] == 1) i+=2;
            else {
                flowerbed[i] = 1;
                i++;
                n--;
            }
        }
        if(flowerbed.length > 1) {
            if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) n--;
        } else {
            if(flowerbed[0] == 0) n--;
        }
        return n < 1;
    }
}