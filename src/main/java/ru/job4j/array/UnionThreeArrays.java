package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] union = new int[2 + middle.length / 2 + right.length / 2];
        union[0] = left[0];
        union[union.length - 1] = left[left.length - 1];
        for (int i = 1; i < middle.length; i++) {
            if (i % 2 != 0) {
                union[i + 1] = middle[i];
            }
        }
        for (int j = 0; j < right.length; j++) {
            if (j % 2 == 0) {
                union[j + 1] = right[j];
            }
        }
        return union;
    }
}
