package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] diagonal = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = data[i].length - 1 - i; j >= data[i].length - 1 - i; j--) {
                diagonal[i] = data[i][j];
            }
        }
        return diagonal;
    }
}
