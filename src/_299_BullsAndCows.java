package leetcode_problems;

public class _299_BullsAndCows {
    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        System.out.println(getHint(secret, guess));
    }

    public static String getHint(String secret, String guess) {
        int[] digits = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            digits[secret.charAt(i)-'0']++;
        }

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                ++bulls;
                digits[guess.charAt(i) - '0']--;
            }
        }

        int digit;

        for (int i = 0; i < guess.length(); i++) {
            digit = guess.charAt(i)- '0';
            if (guess.charAt(i) != secret.charAt(i) && digits[digit] > 0) {
                ++cows;
                digits[guess.charAt(i) - '0']--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
