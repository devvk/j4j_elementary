package ru.job4j.array;

public class Defragment {
    /**
     * Переместить заполненные ячейки массива в начало, а пустые в конец
     */
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            if (array[nullIndex] == null) {
                /* переместить первую не null ячейку.  */
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

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}