package leetcode_problems;

import java.util.Scanner;

public class _67_addBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while (i >= 0 || j >= 0) {                 // 1 0     0   -1
            int sum = carry;                       // sum = 0         sum = 1;
            if (i >= 0) sum += a.charAt(i) - '0';  // sum += 1        sum += 1;
            if (j >= 0) sum += b.charAt(j) - '0';  // sum += 1
            sb.append(sum % 2);                    // 2 % 2 = 0       2 % 2 = 0;
            carry = sum/2;                         // 2/2=1           2 / 1 = 1

            i--;                                   // 0
            j--;                                   // -1
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
