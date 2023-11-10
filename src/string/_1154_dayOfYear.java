package string;

public class _1154_dayOfYear {
    public static void main(String[] args) {
        String date = "2019-02-10";
        System.out.println(dayOfYear(date));
    }

    public static int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int months = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int days = 0;

        int i = 1;

        for (; i < months && i < 8; i++) {
            days += i % 2 == 0 ? 30 : 31;
        }

        for (; i < months; ++i) {
            days += i % 2 == 0 ? 31 : 30;
        }

        days += day;

        System.out.println(days);

        if (months > 2) {
            if (year % 400  == 0 || year % 100 != 0 && year % 4 == 0) --days;
            else days -= 2;
        }

        return days;
    }
}
