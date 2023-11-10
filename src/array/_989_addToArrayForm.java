package array;

import java.util.ArrayList;
import java.util.List;

public class _989_addToArrayForm {
    public static void main(String[] args) {

    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (k > 0) {
                int temp = k % 10;
                if (num[i] + temp + carry > 9) {
                    ans.add(0, (num[i] + temp + carry) % 10);
                    carry = 1;
                } else {
                    ans.add(0, num[i] + temp + carry);
                    carry = 0;
                }
                k /= 10;
            } else {
                if (num[i] + carry > 9) {
                    ans.add(0, 0);
                    carry = 1;
                } else {
                    ans.add(0, num[i] + carry);
                    carry = 0;
                }
            }
        }
        while (k != 0) {
            int temp = k % 10;
            if (temp + carry > 9) {
                ans.add(0, 0);
                carry = 1;
            } else {
                ans.add(0, temp + carry);
                carry = 0;
            }
            k /= 10;
        }
        if (carry == 1) {
            ans.add(0, 1);
        }
        return ans;
    }

    public static String add(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1;
        int carry = 0;
        int sum;

        while (i >= 0 || j >= 0) {
            sum = carry;

            if (i >= 0) sum += s1.charAt(i) - '0';
            if (j >= 0) sum += s2.charAt(j) - '0';

            sb.append(sum % 10);
            carry = sum / 10;
            --i;
            --j;
        }

        if (carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }
}
