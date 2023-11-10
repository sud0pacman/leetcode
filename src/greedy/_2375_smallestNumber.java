package greedy;

public class _2375_smallestNumber {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }

    public static String smallestNumber(String s) {
        StringBuilder stack = new StringBuilder(), res = new StringBuilder();

        for (int i = 0; i <= s.length(); i++) {
            stack.append((char) ('1' + i));
            if (i == s.length() || s.charAt(i) == 'I') {
                res.append(stack.reverse());
                stack = new StringBuilder();
            }
        }

        return res.toString();
    }
}
