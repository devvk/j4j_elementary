package ru.job4j.array;

public class MinDiapason {
    /**
     * Поиск минимума в диапазоне.
     * assertThat(MinDiapason.findMin(new int[]{10, 5, 3, 1}, 1, 3), is(1));
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
