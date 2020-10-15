package ru.job4j.array;

/**
 * Сортировка слиянием
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int counterLeft = 0;
        int counterRight = 0;
        for (int i = 0; i < result.length; i++) {
            if (counterLeft == left.length) {
                result[i] = right[counterRight++];
            } else if (counterRight == right.length) {
                result[i] = right[counterLeft++];
            } else if (left[counterLeft] < right[counterRight]) {
                result[i] = left[counterLeft++];
            } else {
                result[i] = right[counterRight++];
            }
        }
        return result;
    }
}
