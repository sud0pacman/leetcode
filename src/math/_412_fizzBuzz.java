package leetcode_problems.math;

import java.util.ArrayList;
import java.util.List;

public class _412_fizzBuzz {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(fizzBuzz(3));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) ls.add("FizzBuzz");
            else if (i % 3 == 0) ls.add("Fizz");
            else if (i % 5 == 0) ls.add("Buzz");
            else ls.add(String.valueOf(i));
        }

        return ls;
    }
}
