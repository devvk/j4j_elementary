package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int counter = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = counter;
                counter++;
            }
        }
        //System.out.println(Arrays.deepToString(triangle));
        return triangle;
    }
}