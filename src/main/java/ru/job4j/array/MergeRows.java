package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int counter = 0;
        for (int[] ints : data) {
            for (int i : ints) {
                array[counter++] = i;
            }
        }
        return array;
    }
}
