package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
