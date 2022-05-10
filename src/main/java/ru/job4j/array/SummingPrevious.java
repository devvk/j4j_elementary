package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int sum = 0;
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;

        for (int i = 2; i < result.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += result[j];
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }
}
