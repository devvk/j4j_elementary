package ru.job4j.array;

public class Check {

    /**
     * Метод проверяет, что все элементы в массиве являются либо true либо false.
     *
     * @param array массив данных
     * @return результат проверки
     */
    public static boolean mono(boolean[] array) {
        boolean result = true;
        for (boolean value : array) {
            if (value != array[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
