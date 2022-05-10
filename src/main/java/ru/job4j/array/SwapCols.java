package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data.length; i++) {
            int tmp = data[i][dst];
            data[i][dst] = data[i][src];
            data[i][src] = tmp;
        }
    }
}
