package ru.job4j.array;

public class MinDiapason {
    /**
     * Поиск минимума в диапазоне.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            // check for min
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
