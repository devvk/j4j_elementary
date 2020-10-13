package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] merge = new int[data.length * data.length];
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                merge[counter] = data[i][j];
                counter++;
            }
        }
        return merge;
    }
}
