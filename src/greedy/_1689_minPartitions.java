package greedy;

public class _1689_minPartitions {
    public static void main(String[] args) {

    }

    public static int minPartitions(String n) {
        int max = 0;

        for(char c : n.toCharArray()) {
            if (c > max) {
                if (c == 57) {
                    return 9;
                }
                max = c;
            }
        }

        return max-48;
    }
}
