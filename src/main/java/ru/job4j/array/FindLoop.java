package ru.job4j.array;

public class FindLoop {
    /**
     * Поиск элемента в массиве.
     *
     * @param data Массив чисел.
     * @param el   Элемент, который необходимо найти.
     * @return Индекс найденного элемента, либо -1.
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск элемента в массиве.
     *
     * @param data   Массив чисел.
     * @param el     Элемент, который необходимо найти.
     * @param start  Индекс, с которого начинается поиск.
     * @param finish Индекс, которым заканчивается поиск.
     * @return Индекс найденного элемента, либо -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

}
