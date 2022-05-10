package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int result = -1;
        int counter = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                counter++;
                if (counter == number) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
