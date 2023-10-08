package leetcode_problems.array;

import java.util.HashSet;

public class _36_isValidSudoku {
    public static void main(String[] args) {
        String[][] board = {
                {".", ".", ".", ".", "5", ".", ".", "1", "."},
                {".", "4", ".", "3", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", "3", ".", ".", "1"},
                {"8", ".", ".", ".", ".", ".", ".", "2", "."},
                {".", ".", "2", ".", "7", ".", ".", ".", "."},
                {".", "1", "5", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", "2", ".", ".", "."},
                {".", "2", ".", "9", ".", ".", ".", ".", "."},
                {".", ".", "4", ".", ".", ".", ".", ".", "."}
        };
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs;

        for (int i = 0; i < board.length; i++) {
            hs = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[i][j]) && !hs.add(board[i][j])) return false;
            }

            hs = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[j][i]) && !hs.add(board[j][i])) return false;
            }
        }

        return true;
    }
}
