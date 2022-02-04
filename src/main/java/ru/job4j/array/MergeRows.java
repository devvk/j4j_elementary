package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] merge = new int[data.length * data.length];
        int counter = 0;
        for (int[] datum : data) {
            for (int i : datum) {
                merge[counter] = i;
                counter++;
            }
        }
        return merge;
    }
}
