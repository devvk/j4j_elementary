package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }
}
