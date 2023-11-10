package counting;

public class _748_shortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};

        System.out.println(shortestCompletingWord(licensePlate, words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] dp = new int[123];
        licensePlate = licensePlate.toLowerCase();

        for (char c : licensePlate.toCharArray()) {
            ++dp[c];
        }

        int max = 0;
        String res = "";
        boolean busy = false;

        for (String word : words) {
            word = word.toLowerCase();
            int[] temp = new int[123];
            for (char c : word.toCharArray()) {
                ++temp[c];
            }

            int count = 0;
            for (int i = 0; i < 123; i++) {
                if (dp[i] > 0 && temp[i] >= dp[i]) ++count;
            }

            if (count > max) {
                max = count;
                res = word;
            }
            else if (count == max && !busy) {
                res = res.length() < word.length() ? res : word;
                busy = true;
            }
        }

        return res;
    }
}
