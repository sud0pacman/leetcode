package math;

public class _1759_countHomogenous {
    public static void main(String[] args) {
        String s = "zzzzz";
        System.out.println(countHomogenous(s));
    }

    public static int countHomogenous(String s) {
        char[] ss = s.toCharArray();
        char prev = ss[0];
        int len = 0;
        int sum = 0;

        for (char c : ss) {
            if (c == prev) {
                ++len;
            } else {
                sum += len * (len+1) / 2;
                System.out.println(len + " " + sum);

                prev = c;
                len = 1;
            }
        }

        if (len > 0) sum += len * (len+1) / 2;

        return sum;
    }
}
