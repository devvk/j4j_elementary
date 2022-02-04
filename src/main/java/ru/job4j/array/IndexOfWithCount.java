package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int result = -1;
        int n = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                n++;
                if (n == number) {
                    result = i;
                }

            }
        }
        return result;
    }
}
