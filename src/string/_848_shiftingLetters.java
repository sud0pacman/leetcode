package string;

public class _848_shiftingLetters {
    public static void main(String[] args) {
        String s = "mkgfzkkuxownxvfvxasy";
        int[] shifts = {505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513};

        System.out.println(shiftingLetters(s, shifts));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder(s);
        long shift = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.setCharAt(i, (char) ((s.charAt(i) - 'a' + (shift + shifts[i]) % 26) % 26 + 'a'));
            shift += shifts[i];
        }
        return ans.toString();
    }
}
