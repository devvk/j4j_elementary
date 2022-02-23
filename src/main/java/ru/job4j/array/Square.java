package ru.job4j.array;

public class Square {
    /**
     * Метод заполняет массив через цикл элементами от 0 до bound, возведенными в квадрат.
     *
     * @param bound Определяет, до какого  числа нужно записывать числа.
     * @return Массив с элементами от 0 до bound, возведенными в квадрат.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
