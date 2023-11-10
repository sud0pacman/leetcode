package math;

public class _507_checkPerfectNumber {
    public static void main(String[] args) {
        int n = 28;

        System.out.println(checkPerfectNumber(n));
    }

    public static boolean checkPerfectNumber(int num) {
        int count = 1;
        if(num ==1){
            return false;
        }

        for(int i=(int)Math.sqrt(num); i >= 2; i--){
            if(num%i==0){
                count += i+num/i;
            }
        }

        return count == num;
    }
}
