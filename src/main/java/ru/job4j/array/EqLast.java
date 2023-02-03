package ru.job4j.array;

public class EqLast {
    /**
     * Метод сравнивает последние элементы двух массивов.
     *
     * @param left первый массив
     * @param right второй массив
     * @return результат сравнения
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
