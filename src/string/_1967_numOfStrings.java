package string;

public class _1967_numOfStrings {
    public static void main(String[] args) {

    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) ++count;
        }

        return count;
    }
}
