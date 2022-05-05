package ru.job4j.array;

/**
 * Сортировка слиянием.
 */
public class Merge {
    /**
     * Объединить два отсортированных массива.
     *
     * @param left  первый массив
     * @param right второй массив
     * @return отсортированный массив
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (countL == left.length) {
                rsl[i] = right[countR++];
            } else if (countR == right.length) {
                rsl[i] = left[countL++];
            } else if (left[countL] < right[countR]) {
                rsl[i] = left[countL++];
            } else {
                rsl[i] = right[countR++];
            }
        }
        return rsl;
    }
}
