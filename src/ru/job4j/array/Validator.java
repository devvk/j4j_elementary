package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int counter = 0;
        for (int i : data) {
            if (i == value) {
                counter++;
            }
        }
        return counter < data.length / 2;
    }
}
