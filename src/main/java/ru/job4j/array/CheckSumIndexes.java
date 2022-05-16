package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
            }
        }
        int[] array = new int[data.length * data[0].length];
        int counter = 0;
        for (int[] ints : data) {
            for (int j = 0; j < data[0].length; j++) {
                if (ints[j] != 0) {
                    array[counter++] = ints[j];
                }
            }
        }
        array = Arrays.copyOf(array, counter);
        return array;
    }
}
