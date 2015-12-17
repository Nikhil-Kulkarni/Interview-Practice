// Given a 2D board and a word, find if the word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cell,
// where "adjacent" cells are those horizontally or vertically neighboring.
// The same letter cell may not be used more than once.

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'a', 'b', 'c', 'b'}, {'a', 'q', 'd', 'e'}};
        System.out.println(exists(board, "abcde", 0, 0, 0));
    }

    public static boolean exists(char[][] board, String str, int i, int j, int k) {
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0) {
            return false;
        }
        if (board[i][j] == str.charAt(k)) {
            if (k == str.length() - 1) {
                return true;
            }
            char temp = board[i][j];
            board[i][j] = '#';
            if (exists(board, str, i + 1, j, k + 1) || exists(board, str, i, j + 1, k + 1) ||
                exists(board, str, i - 1, j, k + 1) || exists(board, str, i, j - 1, k + 1)) {
                    return true;
            }
            board[i][j] = temp;
        }
        return false;
    }
}
