package leetcode_problems.manipulation;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 2 != 0) --num;
            else num /= 2;
            System.out.println(num);
            ++count;
        }

        return count;
    }
}
