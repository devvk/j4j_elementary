package ru.job4j.array;

import java.util.Arrays;

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

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        System.out.println(Arrays.toString(input));
        String[] compressed = compress(input);
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
