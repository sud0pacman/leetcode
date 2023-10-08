package leetcode_problems.math;

public class _504_convertToBase7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }

    public static String convertToBase7(int num) {
        String str = "";
        int a = 0;
        if(num == 0){
            return "0"+str;
        }

        if(num<0){
            num = num * (-1);
            a++;
        }

        while(num>0){
            str= num%7+ str;
            num = num/7;
        }

        if(a>0){
            return "-"+str;
        }
        return str;
    }
}
