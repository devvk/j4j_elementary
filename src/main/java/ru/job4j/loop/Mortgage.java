package ru.job4j.loop;

public class Mortgage {
    /**
     * Метод вычисляет количество лет, необходимых для погашения кредита.
     *
     * @param amount  Сумма выданная по кредиту.
     * @param salary  Годовой доход.
     * @param percent Процентная ставка по кредиту.
     * @return Количество лет для погашения кредита.
     */
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (int) percent / 100 - salary;
            year++;
        }
        return year;
    }
}
