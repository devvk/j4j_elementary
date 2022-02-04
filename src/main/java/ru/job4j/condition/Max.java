package ru.job4j.condition;

public class Max {
    /**
     * Добавьте еще тест-методы с проверками:
     *         первое максимальное,
     *         второе максимальное,
     *         оба числа одинаковые
     *         (если оба одинаковые, то вернуть любое из этих чисел).
     */
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
