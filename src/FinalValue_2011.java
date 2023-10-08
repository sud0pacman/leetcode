package leetcode_problems;

public class FinalValue_2011 {
    public static void main(String[] args) {
        String[] operation = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operation));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for(String s : operations) {
            if(s.charAt(1) == '-') --res;
            else ++res;
        }

        return res;
    }
}
