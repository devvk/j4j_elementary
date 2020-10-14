package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int countArrayElements = 0;
        int squareArraySize = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                countArrayElements++;
            }
        }
        for (int i = 0; i < countArrayElements; i++) {
            if (i * i >= countArrayElements) {
                squareArraySize = i;
                break;
            }
        }
        int x = 0;
        int y = 0;
        int[][] squareArray = new int[squareArraySize][squareArraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (x >= squareArray.length) {
                    y++;
                    x = 0;
                }
                squareArray[y][x] = array[i][j];
                x++;
            }
        }
        return squareArray;
    }
}