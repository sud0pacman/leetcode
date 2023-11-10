package math;

public class _2582_passThePillow {
    public static void main(String[] args) {
        int n = 4, time = 5;

        System.out.println(passThePillow(n, time));
    }

    public static int passThePillow(int n, int time) {
        int curr = 1;

        while (time > 0) {
            while (curr < n && time-- > 0) {
                curr += 1;
            }
            while (curr > 1 && time-- > 0) {
                curr -= 1;
            }
        }

        return curr;
    }
}
