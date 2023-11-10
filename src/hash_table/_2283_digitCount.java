package hash_table;

public class _2283_digitCount {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        int[] freq = new int[10];

        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' != freq[i]) return false;
        }

        return true;
    }
}
