package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] array = new int[data.length];
        int count = 0;
        for (int i : data) {
            if (i % 2 != 0) {
                array[count++] = i;
            }
        }
        return Arrays.copyOf(array, count);
    }
}
