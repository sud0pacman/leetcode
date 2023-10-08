package leetcode_problems;

public class _709_ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("HEllo"));
    }

    public static String toLowerCase(String s) {
        StringBuilder sBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') sBuilder.append((char) (c + 32));
            else sBuilder.append(c);
        }
        s = sBuilder.toString();

        return s;
    }
}
