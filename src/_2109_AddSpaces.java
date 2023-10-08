package leetcode_problems;

public class _2109_AddSpaces {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};

        System.out.println(addSpaces(s, spaces));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0, l = s.length();

        while (i < l) {
            if (j < spaces.length) {
                if (i == spaces[j]) {
                    sb.append(" ");
                    ++j;
                }
            }

            sb.append(s.charAt(i));
            ++i;
        }

        return sb.toString();
    }
}