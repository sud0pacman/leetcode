package leetcode_problems.array;

public class _79_exist {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board[j].length; k++) {
                    if (word.charAt(i) == board[j][k]) {
                        ++index;
                    }
                }
            }
        }

        System.out.println(index);

        return word.length() == index;
    }
}