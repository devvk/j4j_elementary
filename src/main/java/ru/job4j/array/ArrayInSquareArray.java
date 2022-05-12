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
        int[][] converted = new int[size][size];
        int counter = 0;
        for (int i = 0; i < converted.length; i++) {
            for (int j = 0; j < converted[i].length && counter < array.length; j++) {
                converted[i][j] = array[counter++];
            }
        }
        return converted;
    }
}
