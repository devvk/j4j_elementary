package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i : array) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}
