package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tmp;
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
