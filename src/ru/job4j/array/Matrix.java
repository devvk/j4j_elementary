package ru.job4j.array;

public class Matrix {
    /*
    В ячейки массива нужно записать элементы таблицы умножения.
    size - указывает на размер таблицы.
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
