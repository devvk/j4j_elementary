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
        int[] newArray = new int[data.length * data[0].length];
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] != 0) {
                    newArray[counter] = data[i][j];
                    counter++;
                }
            }
        }
        newArray = Arrays.copyOf(newArray, counter);
        return newArray;
    }
}
