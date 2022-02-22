package ru.job4j.array;

public class SortSelected {

    /**
     * Сортировка выбором.
     *
     * @param data Массив чисел, который нужно отсортировать по возрастанию.
     * @return Отсортированный массив.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}
