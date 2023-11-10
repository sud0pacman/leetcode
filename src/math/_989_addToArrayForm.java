package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _989_addToArrayForm {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;

        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        for(int i = num.length - 1; i>=0; i--) {
            int sum = num[i] + k;

            if(k==0) {
                break;
            } else {
                k = sum/10;
                num[i] = sum%10;
            }
        }

        System.out.println(Arrays.toString(num));

        List<Integer> ans = new ArrayList<>();

        while(k>0) {
            ans.add(0,k%10);
            k = k/10;
        }

        for(int n : num) {
            ans.add(n);
        }

        return ans;
    }
}
