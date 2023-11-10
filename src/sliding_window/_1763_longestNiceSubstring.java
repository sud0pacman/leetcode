package sliding_window;

public class _1763_longestNiceSubstring {
    public static void main(String[] args) {
        String s = "YazaAaa";
        System.out.println(longestNiceSubstring(s));
    }

    public static String longestNiceSubstring(String s) {
        char[] ss = s.toCharArray();
        int diff = 'a' - 'A';
        char prev = ss[0];
        int start = 0;
        int max = 0;
        int sMax = 0, eMax = 0;
        int i = 0;

        for (; i < ss.length; i++) {
            if (diff == Math.abs(prev - ss[i]) || Math.abs(prev - ss[i]) == 0) {
            } else {
                if (i - (start - 1) > max) {
                    max = i - (start - 1);
                    sMax = start;
                    eMax = i - 1;
                }
                start = i;
                prev = ss[i];
            }
        }

        if (i - (start - 1) > max) {
            sMax = start;
            eMax = i - 1;
        }

        char[] res = new char[eMax-sMax+1];

        for (int j = sMax; j <= eMax; j++) {
            res[j-sMax] = ss[j];
        }

        //System.out.println(sMax + " " + eMax);

        return new String(res);
    }
}
