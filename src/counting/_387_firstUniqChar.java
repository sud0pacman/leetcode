package counting;

public class _387_firstUniqChar {
    public static void main(String[] args) {
        System.out.println();
    }

    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c = 'a'; c < '{'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
