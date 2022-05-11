package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] diagonal = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][data[i].length - 1 - i];
        }
        return diagonal;
    }
}
