package application;

import java.util.Arrays;

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

    public static String[][] BOARD = new String[][]{
            {"A", "B", "C", "E"},
            {"S", "F", "C", "S"},
            {"A", "D", "E", "E"}
    };

    public static void main(String[] args) {
    }

    Boolean exists(String[][] board, String word) {

        return (inputValidation(board, word) && match(board, word) && checkForCase(word));
    }

    public boolean checkForCase(String word) {
        return !Character.isLowerCase(word.charAt(0));
    }

    public String wordToUpperCase(String input) {
        return input.toUpperCase();
    }

    boolean inputValidation(String[][] board, String word) {
        if (board == null || word == null) {
            return false;
        }

        return (validBoard(board) && isNotTooLong(board, word));
    }

    boolean validBoard(String[][] board) {
        if (board == null) {
            return false;
        }
        int arrayWidth = board[0].length;

        for (int i = 1; i < board.length; i++) {
            if (arrayWidth != board[i].length) {
                return false;
            }
        }
        return true;
    }

    boolean isNotTooLong(String[][] board, String word) {
        int arrayWidth = board[0].length;
        int arraySpaces;

        arraySpaces = arrayWidth * board.length;
        return arraySpaces >= word.length();
    }

    boolean match(String[][] board, String word) {
        for (String[] line : board) {
            if (Arrays.toString(line).contains(word)) {
                return true;
            }
        }
        return false;
    }
}
