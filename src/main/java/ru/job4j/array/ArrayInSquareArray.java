package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (i * i >= array.length) {
                size = i;
                break;
            }
        }
        int[][] square = new int[size][size];
        int counter = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length && counter < array.length; j++) {
                square[i][j] = array[counter];
                counter++;

            }
        }
        return square;
    }
}
