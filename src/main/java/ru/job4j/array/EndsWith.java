package ru.job4j.array;

public class EndsWith {
    /**
     * Метод проверяет то, что слово заканчивается на определенную последовательность.
     *
     * @param word Проверяемый массив
     * @param post Последовательность для проверки
     * @return Результат проверки true или false
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 1; i < post.length && i < word.length; i++) {
            if (post[post.length - i] != word[word.length - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
