package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] and = new int[left.length + right.length];
        int counter = 0;
        for (int l : left) {
            for (int r : right) {
                if (r == l) {
                    and[counter] = l;
                    counter++;
                }
            }
        }
        return Arrays.copyOf(and, counter);
    }
}
