package ru.job4j.аrrays;

//import java.util.concurrent.LinkedBlockingDeque;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;

        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
          rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        int lengthOfMatrix = board.length;
        char neededSymbol = 'X';
        //boolean winIsFoound;

        for (int index = 0; index < lengthOfMatrix; index++) {
            if (board[index][index] == neededSymbol) { // нашли Х в ячейке
                // ищем по вертикали и горизонтали
                if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    return true;
                }
            }
        }
        return result;
    }
}




