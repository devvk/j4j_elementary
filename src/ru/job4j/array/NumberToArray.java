package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String tmp = Integer.toString(number);
        int[] array = new int[tmp.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = tmp.charAt(tmp.length() - 1 - i) - '0';
        }
        return array;
    }
}
