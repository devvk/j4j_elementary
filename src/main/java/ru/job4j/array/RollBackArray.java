package ru.job4j.array;

public class RollBackArray {
    /**
     * Метод записывает элементы в новый массив в обратном порядке.
     *
     * @param array массив данных
     * @return массив в обратном порядке
     */
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}
