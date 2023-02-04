package ru.job4j.condition;

public class FloatingPointCompare {

    /**
     * Метод сравнивает два числа с плавающей запятой.
     *
     * @param x   первое число с плавающей запятой
     * @param y   второе число с плавающей запятой
     * @param eps эпсилон для погрешности
     * @return результат сравнения true/false
     */
    public static boolean isEqual(double x, double y, double eps) {
        return Math.abs(x - y) < eps;
    }

    public static void main(String[] args) {

        final double epsilon = 0.0001;
        double d1 = 0.123456789123;
        double d2 = 0.123456789124;

        System.out.println(isEqual(d1, d2, epsilon));
    }
}
