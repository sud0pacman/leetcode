package leetcode_problems.string;

public class _13_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            char before = ' ';
            if(i != 0) before = s.charAt(i-1);

            switch(s.charAt(i)) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    if(before == 'I') sum -= 2;
                    break;
                case 'X':
                    sum += 10;
                    if(before == 'I') sum -= 2;
                    break;
                case 'L':
                    sum += 50;
                    if(before == 'X') sum -= 20;
                    break;
                case 'C':
                    sum += 100;
                    if(before == 'X') sum -= 20;
                    break;
                case 'D':
                    sum += 500;
                    if(before == 'C') sum -= 200;
                    break;
                case 'M':
                    sum += 1000;
                    if(before == 'C') sum -= 200;
                    break;
            }
        }

        return sum;
    }
}
