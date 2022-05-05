package ru.job4j.array;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int[] i : array) {
            if (i.length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
