package ru.job4j.loop;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(1));         // 1
        System.out.println(sum(12));        // 3
        System.out.println(sum(123));       // 6
        System.out.println(sum(1234));      // 10
        System.out.println(sum(12345));     // 15
        System.out.println(sum(45));        // 9
    }

    /**
     * Метод рассчитывает сумму цифр числа.
     *
     * @param num Число, для которого необходимо рассчитывать сумму цифр.
     * @return Сумма цифр числа.
     */
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
