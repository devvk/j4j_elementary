package ru.job4j.array;

public class Turn {
    /**
     * Метод переставляет все элементы массива в обратном порядке.
     *
     * @param array Массив с данными.
     * @return Массив с переставленными элементами.
     */
    public static int[] back(int[] array) {
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}
