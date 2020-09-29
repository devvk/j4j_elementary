package ru.job4j.array;

public class SkipNegative {
    /*
    Метод skip должен заменить отрицательные значения в массиве на ноль.
     */
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
