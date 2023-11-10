package string;

public class _1880_isSumEqual {
    public static void main(String[] args) {
        String firstWord = "ajaie", secondWord = "cba", targetWord = "cdb";
        isSumEqual(firstWord, secondWord, targetWord);
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getNumericValue(firstWord) + getNumericValue(secondWord) == getNumericValue(targetWord);
    }

    public static int getNumericValue(String str) {
        int sum = 0;

        for (char c : str.toCharArray())
            sum = sum * 10 + (c - 'a');

        return sum;
    }
}
