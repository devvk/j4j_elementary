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
            // найти минимальный элемент в массиве
            int min = MinDiapason.findMin(data, i, data.length - 1);
            // получить index элемента в массиве
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            // перестановка текущего и минимального элементов в массиве
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
