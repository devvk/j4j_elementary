package ru.job4j.array;

public class MinDiapason {
    /**
     * Поиск минимума в диапазоне.
     *
     * @param array  Массив целых чисел.
     * @param start  Номер начального индекса
     * @param finish Номер конечного индекса
     * @return Минимальное найденное число
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
