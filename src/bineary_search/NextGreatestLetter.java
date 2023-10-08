package leetcode_problems.bineary_search;

import java.util.ArrayList;
import java.util.List;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;

        while (left < right) {
            int middle = left + right >> 1;

            if (letters[middle] <= target) {
                left = middle+1;
            }
            else {
                right = middle;
            }
        }

        return letters[left] > target ? letters[left] : letters[0];
    }
    // binary search left most
}
