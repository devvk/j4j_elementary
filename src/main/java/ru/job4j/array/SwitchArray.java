package ru.job4j.array;

public class SwitchArray {

    /**
     * Метод меняет местами заданные элементы в массиве.
     *
     * @param array  Массив элементов типа int.
     * @param source Индекс элемента, который будет записан в ячейку с индексом dest.
     * @param dest   Индекс элемента, который будет записан в ячейку с индексом source.
     * @return Изменённый массив элементов типа int.
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }

    /**
     * Метод меняет местами нулевой и последний элемент в массиве.
     *
     * @param array Массив элементов типа int.
     * @return Изменённый массив элементов типа int.
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index : rsl) {
            System.out.println(index);
        }
    }
}