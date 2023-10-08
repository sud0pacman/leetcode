package greedy;

public class _2225_convertTime {
    public static void main(String[] args) {
        String current = "00:00";
        String correct = "23:59";

        System.out.println(convertTime(current, correct));

        //System.out.println(convertTime(current, correct));
    }

    public static int convertTime(String current, String correct) {
        int num = hoursToMin(correct) - hoursToMin(current);
        int step = 0;
        while (num > 0) {
            if (num - 60 > -1) num -= 60;
            else if (num - 15 > -1) num -= 15;
            else if (num - 5 > -1) num -= 5;
            else num -= 1;
            ++step;
        }

        return step;
    }

    public static int hoursToMin(String str) {
        int res = (str.charAt(0)-'0') * 10 + str.charAt(1)-'0'; // get hours
        res *= 60;
        res += (str.charAt(3)-'0') * 10 + str.charAt(4)-'0';

        return res;
    }
}
