package math;

public class _650_minSteps {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(minSteps(n));
    }

    public static int minSteps(int n) {
        int count = 0;

        while (n % 2 == 0) {
            count = count + 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                count += i;
                n /= i;
            }
        }

        if (n > 2)
            count += n;
        return count;
    }
}
