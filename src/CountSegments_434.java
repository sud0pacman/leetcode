package leetcode_problems;

public class CountSegments_434 {
    public static void main(String[] args) {
        /*
        test cases
        "Hello, my name is John"
        "Hello"
        ", , , ,        a, eaefa"
        "    foo    bar"
        "                "
         */
    }

    public static int countSegments(String s) {
        int count=0, i;
        for(i=0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
