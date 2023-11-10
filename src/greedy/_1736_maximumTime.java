package greedy;

public class _1736_maximumTime {
    public static void main(String[] args) {
        String time = "?0:15";
        System.out.println(maximumTime(time));
    }

    public static String maximumTime(String time) {
        char[] ar = time.toCharArray();

        if (ar[0] == '?') {
            if (ar[1] == '?' || ar[1] < '4') ar[0] = '2';
            else ar[0] = '1';
        }

        if (ar[1] == '?') ar[1] = ar[0] == '2' ? '3' : '9';

        if (ar[3] == '?') ar[3] = '5';
        if (ar[4] == '?') ar[4] = '9';

        return new String(ar);
    }
}
