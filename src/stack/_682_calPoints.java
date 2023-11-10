package stack;

import java.util.Stack;

public class _682_calPoints {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                stack.push(stack.peek() + stack.elementAt(stack.size()-2));
            }
            else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else if (s.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(s));
            }

            System.out.println(stack);
        }


        int sum = 0;

        for (int i : stack) {
            sum += i;
        }

        return sum;
    }
// '+'. Oldingi ikki ballning yig'indisi bo'lgan yangi ball yozing.
// 'D'. Oldingi ballning ikki barobari bo'lgan yangi ball yozing.
// 'C'. Oldingi ballni rekorddan olib tashlab, bekor qiling.

    //An integer x.
    //Record a new score of x.
    //'+'.
    //Record a new score that is the sum of the previous two scores.
    //'D'.
    //Record a new score that is the double of the previous score.
    //'C'.
    //Invalidate the previous score, removing it from the record.
}
