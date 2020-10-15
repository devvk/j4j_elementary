package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int countNegative = 0;
        for (int i : data) {
            if (i < 0) {
                countNegative++;
            }
        }
        return countNegative % 2 != 0;
    }
}
