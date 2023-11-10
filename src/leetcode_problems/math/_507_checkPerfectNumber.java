package leetcode_problems.math;

public class _507_checkPerfectNumber {
    public static void main(String[] args) {
        int n = 28;

        System.out.println(checkPerfectNumber(n));
    }

    public static boolean checkPerfectNumber(int num) {
        int count = 1;
        if (num == 1) {
            return false;
        }

        for (int i = (int) Math.sqrt(num); i > 1; i--) {
            if (num % i == 0) {
                // bo'lingan sonni va bo'luvcini qo'shadi chunki biz
                // Math.sqrt orqali sqrt dan tepadagi sonlarni chiqarib
                // yuborganmiz nums i bo'lib yuqoridagi sonni olamiz
                // va i sqrt dan pastdagi son
                count += i + num / i;
            }
        }

        return count == num;
    }
}
