package ru.job4j.array;

public class MatrixCheck {
    /*
    Метод проверяет что все элементы в строке заполнены символом 'X'
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /*
    Метод проверяет что все элементы в колонке заполнены символом 'X'
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
