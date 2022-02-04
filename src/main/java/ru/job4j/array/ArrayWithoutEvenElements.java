package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] newData = new int[data.length];
        int index = 0;
        for (int i : data) {
            if (i % 2 == 0) {
                continue;
            } else {
                newData[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(newData, index);
    }
}
