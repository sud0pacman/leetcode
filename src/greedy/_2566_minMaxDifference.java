package greedy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2566_minMaxDifference {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(90));
    }

    public static int minMaxDifference(int num) {
        String max, min, hold = Integer.toString(num);
        char check = 'a';
        boolean isSaw = true;
        char[] array = hold.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == check) {
                array[i] = '9';
                continue;
            }
            if (isSaw && array[i] != '9') {
                check = array[i];
                array[i] = '9';
                isSaw = false;
            }
        }

        max = String.valueOf(array);
        array = hold.toCharArray();

        check = 'a';
        isSaw = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == check) {
                array[i] = '0';
                continue;
            }
            if (isSaw && array[i] != '0') {
                check = array[i];
                array[i] = '0';
                isSaw = false;
            }
        }
        System.out.println(array);

        min = String.valueOf(array);

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}
