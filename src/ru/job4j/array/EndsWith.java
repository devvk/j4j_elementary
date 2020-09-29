package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        for (int i = 1; i < post.length && i < word.length; i++) {
            if (post[post.length - i] == word[word.length - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
