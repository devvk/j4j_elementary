package ru.job4j.array;

public class Defragment {
    /**
     * Дефрагментация массива.
     * Переместить заполненные ячейки массива в начало, а пустые в конец.
     *
     * @param array неотсортированный массив
     * @return дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            if (array[nullIndex] == null) {
                for (int notNullIndex = nullIndex; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        String tmp = array[notNullIndex];
                        array[notNullIndex] = null;
                        array[nullIndex] = tmp;
                        break;
                    }
                }
            }
            System.out.print(array[nullIndex] + " ");
        }
        return array;
    }
}
