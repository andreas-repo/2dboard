package application;

public class Main {
    /*
    Good morning! Here's your coding interview problem for today.

    This problem was asked by Coursera.

    Given a 2D board of characters and a word, find if the word exists in the grid.

    The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

    For example, given the following board:

    [
      ['A','B','C','E'],
      ['S','F','C','S'],
      ['A','D','E','E']
    ]

    exists(board, "ABCCED") returns true,
    exists(board, "SEE") returns true,
    exists(board, "ABCB") returns false.
     */

    /* Pairprogramming pilot/co-pilot style*/
    public static void main(String[] args) {

    }

    Boolean exists(String[] board, String word) {
        if (isNotNull(board) == true) {
            return validBoard(board);
        } else {
            return false;
        }
    }

    boolean validBoard(String[] board) {
        int lenght;
        int arrayWidth = board[0].length();
        boolean valid = false;

        for (int i = 1; i < board.length; i++) {
            lenght = board[i].length();
            if (arrayWidth == lenght) {
                valid = true;
            } else {
                valid = false;
                break;
            }
        }
        return valid;
    }

    boolean isNotNull(Object input) {
        boolean booleanVariable = false;
        booleanVariable = input != null;
        return booleanVariable;
    }

    boolean isNotTooLong(String[] board, String word) {
        validBoard(board);
        int arrayWidth = board[0].length();
        int arraySpaces;
        boolean booleanVariable = false;
        arraySpaces = arrayWidth * board.length;
        if (arraySpaces <= word.length()) {
            booleanVariable = true;
        } else {
            booleanVariable = false;
        }
        return booleanVariable;
    }
}
