package ru.job4j.array;

public class SortSelected {

    /**
     * Сортировка выбором.
     *
     * @param data Массив чисел, который нужно отсортировать по возрастанию.
     * @return Отсортированный массив.
     */
    public static int[] sort(int[] data) {
        int min;
        int indexOfMin;
        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            indexOfMin = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, indexOfMin);
        }
        return data;
    }
}
