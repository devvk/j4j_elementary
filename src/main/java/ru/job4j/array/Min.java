package ru.job4j.array;

public class Min {
    /**
     * Поиск минимального числа в массиве.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
