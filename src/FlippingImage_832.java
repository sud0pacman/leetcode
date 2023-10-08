package leetcode_problems;

import java.util.Arrays;

public class FlippingImage_832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int l = image.length;
        int i = 0, j, temp;

        while(i < l) {
            for(j = 0; j < l/2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][l-1-j];
                image[i][l-1-j] = temp;
            }

            ++i;
        }

        for (int[] ints : image) {
            for (j = 0; j < ints.length; j++) {
                if (ints[j] == 0) ints[j] = 1;
                else ints[j] = 0;
            }
        }

        return image;
    }
}
