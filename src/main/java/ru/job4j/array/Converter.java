package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int countArrayElements = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                countArrayElements++;
            }
        }

        int squareArraySize = 0;
        for (int i = 0; i < countArrayElements; i++) {
            if (i * i >= countArrayElements) {
                squareArraySize = i;
                break;
            }
        }

        int[][] squareArray = new int[squareArraySize][squareArraySize];
        int x = 0;
        int y = 0;
        for (int[] ints : array) {
            for (int i : ints) {
                if (x >= squareArray.length) {
                    y++;
                    x = 0;
                }
                squareArray[y][x] = i;
                x++;
            }
        }
        return squareArray;
    }
}
