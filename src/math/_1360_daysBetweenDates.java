package math;

public class _1360_daysBetweenDates {
    public static void main(String[] args) {
        String date1 = "2020-01-15", date2 = "2019-12-31";
        System.out.println(daysBetweenDates(date1, date2));
    }

    public static int daysBetweenDates(String date1, String date2) {
        int year1 = Integer.parseInt(date1.substring(0, 4));
        int month1 = Integer.parseInt(date1.substring(5, 7));
        int day1 = Integer.parseInt(date1.substring(8));

        int year2 = Integer.parseInt(date2.substring(0, 4));
        int month2 = Integer.parseInt(date2.substring(5, 7));
        int day2 = Integer.parseInt(date2.substring(8));

        int y = Math.abs(year1 - year2);

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m1 = 0;

        while (month1 > 0) {
            m1 += months[--month1];
        }

        m1 += day1;

        int m2 = 0;

        while (month2 > 0) {
            m2 += months[--month2];
        }

        m2 += day2;

        if (isLeapYear(year1)) --m1;
        if (isLeapYear(year2)) --m2;

        return Math.abs(m1 - m2);
    }

    public static boolean isLeapYear(int y) {
        return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
    }
}
