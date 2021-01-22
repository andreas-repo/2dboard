package application;

import java.util.Arrays;
import java.util.List;

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

    public static void main(String[] args) {

    }

    public Boolean exists(String[][] board, String word) {
        Boolean returnValue = validateInput(board, word);
        return returnValue;
    }

    boolean findStart(String[][] board, String word) {
        String startingLetter = String.valueOf(word.charAt(0));
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
               if (board[row][cell].equalsIgnoreCase(startingLetter)) {
                   return true;
               }
            }
        }
        return false;
    }

    public Boolean validateInput(String[][] board, String word) {
        if(board == null) return false;
        if(word == null) return false;

        if (board.length == 0) return false;
        if (word.isEmpty()) return false;

        return matchDimensions(board);
    }

    private Boolean matchDimensions(String[][] board) {
        int arrayWidth = board[0][0].length();

        for (int i = 0; i < board.length; i++) {
            if (board[i][0].length() != arrayWidth){
                return false;
            }
        }
        return true;
    }

    public String[][] parseBoard(String[][] board) {
        String[][] boardArray = new String[board.length][board[0][0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i][0].length(); j++) {
                boardArray[i][j]= String.valueOf(board[i][0].charAt(j));
            }
        }
        return boardArray;
    }
}
