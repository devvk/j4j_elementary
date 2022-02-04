package ru.job4j.array;

import java.util.Arrays;

/**
 * Необходимо реализовать метод который вернет одномерный массив, который не будет содержать значений 0
 * (необходимо использовать метод Arrays.copyOf()). При этом исходные данными будут следующими:
 * <p>
 * 1. Квадратный двумерный массив целочисленных значений data.
 * <p>
 * 2. Целочисленный элемент sum, который означает сумму индексов в массиве.
 * <p>
 * При этом необходимо чтобы выполнились следующие условия:
 * <p>
 * 1. Если сумма индексов при переборе двумерного массива равна sum, то элемент с такими индексами должен принять
 * значение 0.
 * <p>
 * 2. Выходной одномерный массив не должен содержать значения 0.
 */
public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
            }
        }
        int[] newArray = new int[data.length * data[0].length];
        int counter = 0;
        for (int[] datum : data) {
            for (int j = 0; j < data[0].length; j++) {
                if (datum[j] != 0) {
                    newArray[counter] = datum[j];
                    counter++;
                }
            }
        }
        newArray = Arrays.copyOf(newArray, counter);
        return newArray;
    }
}
