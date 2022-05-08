package ru.job4j.array;

public class Defragment {
    /**
     * Дефрагментация массива.
     * Метод перемещает заполненные ячейки массива в начало, а пустые в конец.
     *
     * @param array неотсортированный массив
     * @return дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
