package ru.job4j.array;

/**
 * Сортировка слиянием
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countLeft = 0;
        int countRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (countLeft == left.length) {
                rsl[i] = right[countRight++];
            } else if (countRight == right.length) {
                rsl[i] = left[countLeft++];
            } else if (left[countLeft] < right[countRight]) {
                rsl[i] = left[countLeft++];
            } else {
                rsl[i] = right[countRight++];
            }
        }
        return rsl;
    }
}
